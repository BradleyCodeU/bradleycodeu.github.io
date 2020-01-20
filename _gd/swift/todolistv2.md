---
layout: project
category: swift
title: Todo List v2
---
_Note: the following directions were created for Xcode version 11.3_

Creating a ToDo List App

Now that you've become familiar with the basic concepts involved in creating iOS apps, let's create a real-world ToDo List App. In the app, there will be a list of to-do items, which can be removed and edited. New items can also be added to the list.

Delete your old Name label and Submit button.

Now it's time to create the scene that shows the entire list of to-do items. We'll use table view (UITableView), a powerful built-in iOS class that is specifically designed to create and display a scrolling item list.
First, open Main.storyboard.
Next, go to the Utility area to open the Object library. Drag a Table View Controller object from the list and drop it on the canvas to the left of the existing scene.
You now have two scenes, one for displaying the list and one for adding a new item.
If nothing happens when dragging a table view with content to the canvas, you are most likely attempting to drag a table view. Make sure that you select a _table view controller_

###Create the Opening Scene

When the app is launched the list should be the first thing your users see. We need to set the table view controller as your first scene in Xcode.
Drag the storyboard entry point (an arrow ---> currently pointing to your original View) over to the table view controller.

With the table view controller set as the initial view controller in your storyboard, this will be the first scene that loads upon launching the app.

Your storyboard should look like this:
![entry Point](/gd/swift/img/entryPoint.jpg)

If you test run your app now, you'll see an empty table view, which is a screen with a number of horizontal dividers separating it into rows that contain no content.

###Modifying the Table View

In the outline view, find and select Table View, which is nested under Table View Controller Scene > Table View Controller. With the table view selected, go to the Utility area and open the Size inspector. In the Size inspector, type 90 in the Row Height field. Press Return.

Now we need to add two custom classes:
  - a class to create table view cell objects. In other words, to create row objects.
  - a table view controller, in order to control the entire table and be able to add outlets/actions to this view.

###Custom Table Cells

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

###Configuring a Custom Cell

To connect the table view cell in the scene to our just-created custom cell subclass, select the Table View Cell in the storyboard's outline view.

![TableViewCell In The Hierarchy](/gd/swift/img/TableViewCellInTheHierarchy.jpeg)

With the table view cell selected, open the Attributes inspector in the Utility area.
In the Attributes inspector, find the field labeled Identifier and type ItemTableViewCell.

![TableViewCell Identifier](/gd/swift/img/TableViewCellIdentifier.jpeg)

Open the Identity inspector. In the field labeled Class, select ItemTableViewCell.

![custom Class ItemTableViewCell](/gd/swift/img/customClassItemTableViewCell.jpeg)

The class of our cell prototype is now set to the newly created ItemTableViewCell class.
