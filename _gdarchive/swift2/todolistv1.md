---
layout: project
category: swift2
title: Todo List v1
---
_Note: the following directions were created for Xcode version 11.3_

* TOC
{:toc}

In the welcome window, click "Create a new Xcode project" (or choose File > New > Project).
Xcode displays template choices in a new window.
In the iOS section at the top of the dialog, click Single View App under the Application section and then click Next.

In the dialog that appears, type a Product Name such as "Todo List App" and then you MUST make sure that the User Interface is set to "Storyboard" (not "SwiftUI"). For the organization identifier, use com.example

![Xcode Areas labeled](/gd\swift\img\xcodeAreas.jpg)

## The Project Navigator

The project navigator displays all of the files in your project. If the project navigator isn't open, click the button on the far left end of the navigator selector bar.

![Project Navigator](/gd\swift\img\projectNav.jpg)

If necessary, open the MyApp folder in the project navigator by clicking the triangle icon next to it.
Select AppDelegate.swift.
Xcode opens the source file in the window's main editor area.

## The App Delegate

AppDelegate controls the entire app.

The AppDelegate.swift source file has two primary functions.
1. Creating a point of entry and a run loop that delivers input events to your app. This work is carried out by the UIApplicationMain attribute (@UIApplicationMain), which appears toward the top of the file.
2. Defining the AppDelegate class, which serves as the blueprint for the app delegate object. The app delegate creates the window where your app's content is drawn, and provides a place to respond to state transitions within the app. The AppDelegate class is where you write your custom app-level code. It contains a single property, window.

```
var window: UIWindow?
```

The AppDelegate class also contains templates of important methods. These predefined methods allow the application object to talk to the app delegate.

```
func application(_ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions:
        [UIApplicationLaunchOptionsKey: Any]?) -> Bool

func applicationWillResignActive(_ application: UIApplication)

func applicationDidEnterBackground(_ application: UIApplication)

func applicationWillEnterForeground(_ application: UIApplication)

func applicationDidBecomeActive(_ application: UIApplication)

func applicationWillTerminate(_ application: UIApplication)
```

During an app state transition - for example, app launch, transitioning to the background, and app termination - the application object calls the corresponding method in the app delegate, giving it an opportunity to respond appropriately.

Method templates can also be used to add custom code that will execute when the methods are called.

## The View Controller

A view controller manages a view (you could think of it as a "page" perhaps), which could also contain subviews. The view controller file can contain code that defines user interactions with the view and with other objects in the app.

Select ViewController.swift in the project navigator to view it.
At this point, your ViewController.swift code should look something like this:

```
import UIKit

class ViewController: UIViewController {

  override func viewDidLoad() {
    super.viewDidLoad()
    // Do any additional setup after loading the view...
  }

}
```

## The Storyboard

Open Your Storyboard

A storyboard is a visual representation of the app's user interface, showing screens of content and the transitions between them. You see exactly what you're building while you're building it.

In the project navigator, select Main.storyboard.
Xcode opens the storyboard in Interface Builder, which is the visual interface editor, located in the editor area. The storyboard's background is called the canvas. The canvas is used to add and arrange UI elements.

At this point, your app's storyboard contains one scene that represents an app screen showing content. The left-pointing arrow on the canvas is the storyboard entry point, which means that this scene loads first upon starting the app.

#### Build the Basic UI

Xcode provides a library of objects that can be added to a storyboard file.
The elements in the UI are called views, and they display content to the user.
All view objects in iOS are of type UIView, or one of its subclasses.
Let's add a text field to our view.
Open the Object library.

Type text field in the filter field in the Object library to quickly find the Text Field object.
Drag a Text Field object from the Object library to your scene.
Click the text field to reveal the resize handles, which appear as small white squares on the element's borders. Drag the resize handles to resize the UI element. Blue layout guides appear to help you place, resize and position the text field.

![text Field Resize Handles](/gd\swift\img\textFieldResizeHandles.jpg)

#### Placeholder Text

Use the text field's placeholder text to prompt the user to enter the value you need.
Select the text field, and open the Attributes inspector (the slider icon that kinda looks like a shield?) in the utility area, in order to edit the properties of an object in your storyboard.

Enter the placeholder text and press Return to display it in the text field.
You can also edit the attributes of the system keyboard that's displayed when a user selects the text field.
Make sure the text field is still selected.
In the Attributes inspector, find the field labeled Return Key and select Done.
This change will make the default Return key on the keyboard more pronounced to the user by changing it into a Done key.

#### Button and Label

Next add a button (Submit) and label (Name) to our scene from the Object library:

![button And Label](/gd\swift\img\buttonAndLabel.jpg)

A label just displays static text in the UI, while a button is interactive. The user can tap the button to trigger an action that you've defined. In the next lesson, you'll create an action for the button.

You can edit the text of label and/or button by double-clicking.

The outline view, which appears on the left side of the canvas, shows you a hierarchy of your storyboard objects. You should be able to see the text field, label, and button you just added listed in the hierarchy.

Not only do views display themselves onscreen and react to user input, they can serve as containers for other views. Views are arranged in a hierarchical structure called the view hierarchy.

## Auto layout

Auto Layout is a powerful layout engine that makes it easy to design adaptive layouts. Describe your intent as you position a scene's elements, and let the layout engine determine how that intent is best implemented.
Intent is described using constraints, which are rules explaining where one element should be located in relation to another, what size it should be, or which of two elements should shrink first when the space available for each is somehow reduced.
A stack view provides a streamlined interface for laying out a collection of views in either a column or a row.

Add a Stack View from the object library and place the text field, label, and button inside the Stack View.

Xcode wraps the UI elements in a stack view, stacking them together. To set or change the stack's settings, open the outline view and select the Stack View object.

In the Attributes inspector, type 12 in the Spacing field. Press Return. You can also change the Axis of the Stack.
Notice that the UI elements space out vertically, and the stack view grows along with them. You can play around with the settings and check results on the canvas.
Let's also change the Alignment to Leading, so that the elements position left.

![stack View](/gdarchive/swift/img/stackView.jpg)

Run your app in the simulator. Click inside of the text field, and type some text, using the keyboard. You can toggle the software keyboard by pressing Command-K. If you rotate the device (Command-Left Arrow or Command-Right Arrow) or run the app on a different device, the text field adapts to fit the appropriate size, depending on the device's orientation and screen size.

## Connect the UI to your code

Elements in a storyboard are linked to source code. It's important to understand the relationship between storyboard and code.

In a storyboard, a scene represents one screen of content and, typically, one view controller. A view controller implements the app's behavior, managing a single content view with its hierarchy of subviews.
Xcode has already created one, ViewController.swift, which was connected to the scene you're currently working on in your storyboard. In the future, as you add more scenes, you'll make this connection yourself in the Identity inspector. The Identity inspector lets you edit properties of an object in your storyboard, in relation to that object's identity, such as the object's class.

![identity Inspector Icon](/gdarchive/swift/img/identityInspectorIcon.jpg)

At runtime, your storyboard will create an instance of ViewController, your custom view controller subclass. The app screen will show the UI defined in this scene in your storyboard and any behavior defined in ViewController.swift.
The scene is connected to ViewController.swift, but there are other connections to be made, as well. To define interaction in your app, your view controller source code needs to be able to communicate with your storyboard views. This is accomplished by defining additional connections - called outlets and actions - that go between the views in the storyboard and the view controller source code files.

## Outlets

Outlets offer a way to reference the interface objects that you added to your storyboard from source code files. For example, you'll need to create outlets for the text field and label them in your UI to be able to reference them.

To connect the text field to the ViewController.swift code, open your storyboard, called Main.storyboard.

#### Open the Assistant Editor

Select Main.storyboard in the Navigator, click the Editor drop-down menu and then select Assistant. Xcode automatically picks a file for you to edit on the right. IF IT OPENED THE WRONG FILE you can drag ViewController.swift from the Navigator area to the top of the new Editor window on the right.

![Click Editor DropDown Then Assistant](/gdarchive/swift/img/ClickEditorDropDownThenAssistant.gif)

Another way to get the same split-screen is to click the "Add Editor On Right" button. You should now have a split-screen. Next, click on the file that you want to open (ViewController.swift) from the Navigator area.

![add Editor To Right](/gdarchive/swift/img/addEditorToRight.gif)

If necessary, you can drag a file from the Navigator area to the top of either Editor window.

![drag a file from the Navigator area to the top of either Editor window](/gdarchive/swift/img/splitscreen3.gif)

#### Let's create an outlet

In your storyboard, select the text field. While holding the Control button, drag from the text field on your canvas to the code display in the editor on the right, stopping the drag at the line below the class definition (```class ViewController: UIViewController```).

![creating An Outlet](/gdarchive/swift/img/creatingAnOutlet.jpg)

A dialog appears. For Name, type the desired name for your text field. In our example, we've named it nameTextField.

![outlet Dialog Box](/gdarchive/swift/img/outletDialogBox.jpg)

Click Connect.

Xcode adds code to ViewController.swift that will store a pointer to the text field and configures the storyboard to set up that connection:

```
@IBOutlet weak var nameTextField: UITextField!
```

The weak keyword means that it's possible for that property to have no value (to be nil) at some point in its life. The rest of the declaration declares a variable of type UITextField named nameTextField.

Repeat the process for the label, and name it nameLabel.
You now have a way to refer to the interface elements from code. Now, you'll need to define a user-initiated event that triggers interaction between those elements.

## Actions

An action is a piece of code that is linked to an event that can take place at some point in your app. When that event takes place, the code is executed. An action method can be declared to accomplish anything from manipulating a piece of data to updating the UI.
An action is created in the same way as an outlet. That is, control-drag from a particular object in your storyboard to a view controller file.
Let's create an action for our button, to set the label's text to the text the user inputs in the text field.

Control-drag from the Submit button on your canvas to the code display in the editor on the right.
In the dialog that appears, for Connection, select Action.
For Name, type a name, for example: setLabelText.
For Type, select UIButton.
Your dialog should look like this:

![action Dialog Box](/gdarchive/swift/img/actionDialogBox.jpg)

Click Connect.
The Type field value defaults to AnyObject, a type used in Swift to describe an object that can belong to any class.

Xcode adds the necessary code to ViewController.swift to set up the action method.

```
@IBAction func setLabelText(_ sender: UIButton) {

}
```

The sender parameter points to the object responsible for triggering the action - in this case, a button. The rest of the declaration declares a method named setLabelText.
The IBAction attribute indicates that the method is an action to which you can connect from your storyboard in Interface Builder.


#### Defining an Action

In the method implementation, add this line of code:

```
nameLabel.text = nameTextField.text
```

The above code sets the label's text property to the text field's text property.We refer to the label and text field by the names we defined while creating the corresponding outlets.

Now, run your app on the Simulator, type a name in the text field and press the Submit button. The typed name should appear as the Label.

## View Controller Lifecycle

So far, our app has a single scene, whose UI is managed by a single view controller. As you build apps that are more and more complex, you'll be dealing with greater numbers of scenes. You will need to have the ability to manage loading and unloading views as they're moved on and off the screen.
An object of the UIViewController class, and of its subclasses, comes with a set of methods that serve to manage its view hierarchy. iOS automatically calls the methods at appropriate times when a view controller transitions between states.

Here are a few...
- viewDidLoad(): Called when the view controller's content view is created and loaded from a storyboard.
- viewWillAppear(): Intended for any operations that you want always to occur before the view becomes visible.
- viewDidAppear(): Intended for any operations that you want to occur as soon as the view becomes visible, such as fetching data or showing an animation.
