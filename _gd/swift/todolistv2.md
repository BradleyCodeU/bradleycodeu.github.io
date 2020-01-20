---
layout: project
category: swift
title: Todo List v2
---
_Note: the following directions were created for Xcode version 11.3_

* TOC
{:toc}



Now that you've become familiar with the basic concepts involved in creating iOS apps, let's create a real-world ToDo List App. In the app, there will be a list/array of to-do items, which can be removed and edited. New items can also be added to the list.

## Creating a ToDo List App

Delete your old Name label and Submit button.

Now it's time to create the scene that shows the entire list of to-do items. We'll use table view (UITableView), a powerful built-in iOS class that is specifically designed to create and display a scrolling item list.
First, open Main.storyboard.
Next, go to the Utility area to open the Object library. Drag a Table View Controller object from the list and drop it on the canvas to the left of the existing scene.
You now have two scenes, one for displaying the list and one for adding a new item.
If nothing happens when dragging a table view with content to the canvas, you are most likely attempting to drag a table view. Make sure that you select a _table view controller_

#### Create the Opening Scene

When the app is launched the list should be the first thing your users see. We need to set the table view controller as your first scene in Xcode.
Drag the storyboard entry point (an arrow ---> currently pointing to your original View) over to the table view controller.

With the table view controller set as the initial view controller in your storyboard, this will be the first scene that loads upon launching the app.

Your storyboard should look like this:
![entry Point](/gd/swift/img/entryPoint.jpg)

If you test run your app now, you'll see an empty table view, which is a screen with a number of horizontal dividers separating it into rows that contain no content.

#### Modifying the Table View

In the outline view, find and select Table View, which is nested under Table View Controller Scene > Table View Controller. With the table view selected, go to the Utility area and open the Size inspector. In the Size inspector, type 90 in the Row Height field. Press Return.

Now we need to add two custom classes:
  - a class to create table view cell objects. In other words, to create row objects.
  - a table view controller, in order to control the entire table and be able to add outlets/actions to this view.

## Custom Table Cells

The individual rows in a table view are managed by table view cells. The single cell shown in the table view controller scene in your storyboard acts as a prototype for the other cells in the table view, so any design and/or behavior assigned to this cell will display in all of the others.
In our list, a simple label for each table view cell will display the ToDo item's name.
To do this find a Label object in the Object library and drag it onto the table cell. Place the Label object close to the left side of the table cell, aligned to the center of the cell. Also, stretch it to the end of the cell.

![label In A Prototype Table Cell](/gd/swift/img/labelInAPrototypeTableCell.jpeg)

Choose File > New > File. A dialog appears. To its top, and under iOS, select Cocoa Touch Class under the Source section and click Next.

In the Class field, type the name of our items' cell, which is Item.
Select UITableViewCell in the "Subclass of" field. The name of the class will automatically change to ItemTableViewCell.
Make sure that the Language option is set to Swift.

![Class Name ItemTableViewCell](/gd/swift/img/ClassNameItemTableViewCell.png)

Click Next.
The save location defaults to your project directory. Leaving the defaults as they are, click Create.
Xcode creates a file that defines the ItemTableViewCell class as ItemTableViewCell.swift
This creates a class for our cells, inherited from the UITableViewCell class. We can now configure the items in our table.

#### Configuring a Custom Cell

To connect the table view cell in the scene to our just-created custom cell subclass, select the Table View Cell in the storyboard's outline view.

![TableViewCell In The Hierarchy](/gd/swift/img/TableViewCellInTheHierarchy.jpeg)

With the table view cell selected, open the Attributes inspector in the Utility area.
In the Attributes inspector, find the field labeled Identifier and type ItemTableViewCell.

![TableViewCell Identifier](/gd/swift/img/TableViewCellIdentifier.jpeg)

Open the Identity inspector. In the field labeled Class, select ItemTableViewCell.

![custom Class ItemTableViewCell](/gd/swift/img/customClassItemTableViewCell.jpeg)

The class of our cell prototype is now set to the newly created ItemTableViewCell class.

#### Connect the Table Cell UI to Code

Before we can display dynamic data in your table view cells, we need to create outlet connections.
In your storyboard, select the label in the table view cell.

Open the assistant editor. [Click here]() if you need a quick reminder of how to open the split-screen assistant editor.

From the label on your canvas, control-drag to the code display in the editor on the right, to ItemTableViewCell.swift. In the dialog, give your label the Name of nameLabel. Click Connect.
The property will be generated for the label:
`@IBOutlet weak var nameLabel: UILabel!`

Even though you added all the necessary UI elements to your table view cells, they're showing up empty, until you implement the data model behind it.

## Define the Data Model

The data model stores the information to be displayed by the scene. To define it, define a simple class with the properties needed for the items. For our purposes, we need a name property of type String.
To create a new data model class, choose File > New > File
When the dialog appears, select Swift File under the Source section, and click Next.
In the Save As field, type Item as the name of your model.
Click Create, and Xcode creates a file called Item.swift.

Add the following code to create the class:
`class Item {
   var name: String

   init(name: String) {
     self.name = name
   }
}`

This newly defined class can now be used to add items to our table.

## Load Initial Data

At this point, we have a data model for an item, the Item class. We need to write some code to have real data display in the table's cells.
The first step is to create a custom table view controller subclass to manage the items list scene.
Choose File > New > File, and then create a new Cocoa Touch Class named Item.
In the "Subclass of" field, select UITableViewController.
The class title now changes to ItemTableViewController.
Leave these defaults as they are, and click Create. Xcode creates ItemTableViewController.swift, a source code file that defines your custom table view controller subclass.

Next, open your storyboard to point the table view controller scene to ItemTableViewController.swift. Select the table view controller by clicking on its scene dock until the entire scene is outlined in blue. Then select the ItemTableViewController class from the Identity inspector.

![Custom Class ItemTableViewController](/gd/swift/img/CustomClassItemTableViewController.jpeg)

Select the ItemTableViewController class from the Identity inspector.

#### Create the items array

Open ItemTableViewController.swift
Add the following code just below the class line in ItemTableViewController.swift:
`var items  = [Item]()`

Declare a function to load the sample data into the array:
`func loadSampleItems() {
   items += [Item(name:"item1"), Item(name:"item2"), Item(name:"item3")]
}`

The function adds three sample Items to the array.
Now, add the method to the viewDidLoad():
`override func viewDidLoad() {
   super.viewDidLoad()

   loadSampleItems()
}`

#### Display the Data

Methods for displaying data in the table are found in ItemTableViewController.swift. Find the data source method numberOfSections(). The template implementation looks like this:
`override func numberOfSections(in tableView: UITableView) -> Int {
  // #warning Incomplete implementation, return the number of sections
  return 0
}`
Change the return value from 0 to 1, and remove the warning comment.
`override func numberOfSections(in tableView: UITableView) -> Int {
  return 1
}`
This code has the table view show one section instead of zero.

## The tableView method

The next data source method, tableView(), tells the table view how many rows to display in a given section. The number of rows should be the same as the number of Items objects in your items array.

NOTICE that this version of the tableView method has _numberOfRowsInSection_ in the list of parameters.
`override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
   return items.count
}`


In ItemTableViewController.swift, find and uncomment the tableView(_:*cellForRowAt indexPath*:) data source method.

NOTICE that this version of the tableView method has _cellForRowAt indexPath_ in the list of parameters.
After you do that, the template implementation looks like this:
`override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
let cell = tableView.dequeueReusableCell(
withIdentifier: "reuseIdentifier", for: indexPath) as UITableViewCell
  // Configure the cell...

  return cell
}`

The template performs several tasks. It asks the table view for a cell with a placeholder identifier, adds a comment about where code to configure the cell should go, and then returns the cell.
To make this code work for your app, you'll need to change the placeholder identifier to the one you set earlier for the prototype cell in the storyboard (ItemTableViewCell), and then add code to configure the cell.
Your tableView(_:*cellForRowAt indexPath*:) method should look like this:
`override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
let cell = tableView.dequeueReusableCell(
withIdentifier: "ItemTableViewCell", for: indexPath) as! ItemTableViewCell
  // Configure the cell...
 let item = items[indexPath.row]
  cell.nameLabel.text = item.name
  return cell
}`

Notice that the cell type is changed to ItemTableViewCell. Then we take the corresponding item from our items variable and assign the cell's label the name of the item.
indexPath is the number of the current row, which is used to query the item.

Now, when you run the app, you will see the items you added to the items array appear in the table.


## Implement Navigation

The data display as expected; now we need to provide for navigation from the items list to the item scene. The transitions between app scenes are called segues.
A navigation controller manages transitions backward and forward through a series of view controllers. The set of view controllers managed by a particular navigation controller is called its navigation stack.
Open Main.storyboard.
Select the table view controller by clicking on its scene dock.

![Scene Dock](/gd/swift/img/SceneDock.jpeg)

With the table view controller selected, choose Editor > Embed In > Navigation Controller.
Xcode now adds a new navigation controller to your storyboard, sets its storyboard entry point, and establishes a relationship between the new navigation controller and your existing table view controller.

![Adding A Navigation Controller](/gd/swift/img/AddingANavigationController.jpeg)

On the canvas, the icon that connects the controllers indicates the root view controller relationship.
You might notice that your table view now has a bar at the top. This is a navigation bar.

Every controller on the navigation stack has its navigation bar, which can contain controls for backward and forward navigation.

#### Configure the Navigation Bar

To add a title, double-click the navigation bar in the items list scene or edit the Title property in Attributes inspector.

![Add A Title To The Nav Bar](/gd/swift/img/AddATitleToTheNavBar.jpeg)

Enter a title and press Return.
In the Object library, find a Bar Button Item object.
Drag a Bar Button Item object from the list to the far right of the navigation bar.
A button called Item appears where you dragged the bar button item.

![Drag A Bar Button Item](/gd/swift/img/DragABarButtonItem.jpeg)

Select the bar button item and open the Attributes inspector, where you'll choose Add from the pop-up menu next to the System Item option.
The button will change to an Add button (+).

The varying choices for the System Item property can be used to change the appearance of the button.

#### Configure The Add button

To have the Add button (+) bring up the item scene, we need to trigger a segue (or transition) to that scene.
On the canvas, select the Add button (+) and Control-drag from the button to the item scene.

![Control Drag From The Add Button](/gd/swift/img/ControlDragFromTheAddButton.jpeg)

A shortcut menu with the title Action Segue appears in the location where the drag ended.

![Action Segue Menu](/gd/swift/img/ActionSegueMenu.jpeg)

The Action Segue menu allows you to choose what type of segue to use when transitioning.
Choose show from the Action Segue menu.
Run your app. You can click the Add button and navigate to the item scene from the items list scene. Because you're using a navigation controller with a show segue, the backward navigation is handled for you, and a back button automatically appears in the scene.

We have also removed the Save Item button from the scene; we'll add the Save and Cancel button to the navigation.

#### The Save and Cancel Buttons

To add the "New Item" scene to the navigation, simply repeat the steps you used for the items list scene when embedding it in a Navigation Controller. Give it a title and add two Bar Button Items, selecting Cancel and Save as the System Item in Attribute inspector.
Run the app. When you click the Add button from the items list, you should see this:

![The Save And Cancel Buttons](/gd/swift/img/TheSaveAndCancelButtons.jpeg)

The buttons haven't been linked to any actions yet, so they need to be configured for actions.

## Adding Items

Now we need to implement the Save functionality in our ViewController.
Open ViewController.swift and add an Item property:
`var item: Item?`

This is an optional Item, meaning that it may be nil at any point.

The Save button requires an outlet in order to work.
Open Assistant Editor, and control-drag from the Save button on your canvas to the code display in the editor on the right.
In the dialog that appears, type saveButton in the Name field and click Connect:

![saveButton Outlet](../../../../../../../_gd/swift/img/saveButtonOutlet.jpeg)
