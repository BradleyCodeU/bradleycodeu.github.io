---
layout: project
category: swift
title: Flashlight
---
_Note: the following directions were created for Xcode version 11.3_

In the welcome window, click "Create a new Xcode project" (or choose File > New > Project).
Xcode displays template choices in a new window.
In the iOS section at the top of the dialog, click Single View App under the Application section and then click Next.

In the dialog that appears, type a Product Name such as "Flashlight App" and then you ```MUST``` make sure that the User Interface is set to "Storyboard" (not "SwiftUI"). For the organization identifier, use com.example

## The First Flashlight App

When the iPhone was first released there was no flash and no way to easily use it as a flashlight. One of the most popular apps when the App Store launched in 2008 was Flashlight, an app that simply set the screen background to white.

## Add A Button

Drag a button into the Scene from the Object Library.

#### Open the Assistant Editor

Click the "Add Editor On Right" button. You should now have a split-screen. Next, click on the file that you want to open (ViewController.swift) from the Navigator area.

![add Editor To Right](/gd/swift/img/addEditorToRight.gif)

If necessary, you can drag a file from the Navigator area to the top of either Editor window.

Another way to get the same split-screen with Storyboard and Code Editor is to click the Editor drop-down menu and then select Assistant. Xcode automatically picks a file for you to edit on the right, but IF IT OPENED THE WRONG FILE you can drag ViewController.swift from the Navigator area to the top of the new Editor window on the right.

#### Developer Documentation

Option-click on viewDidLoad. Notice that a summary box appears.

Click the Window drop-down menu and then Developer Documentation. Search for viewDidLoad

Let's set the starting background to dark gray. Inside of the viewDidLoad function, type:
```
view.backgroundColor = .darkGray
```

## Actions

An action is a piece of code that is linked to an event that can take place at some point in your app. When that event takes place, the code is executed. An action method can be declared to accomplish anything from manipulating a piece of data to updating the UI.
An action is created by control-drag from a particular object in your storyboard to a view controller file. This is the same way an outlet is created. We will learn about outlets later.

Let's create an action for our button.

#### Create an action

While holding the Control button, drag from the button on your canvas to the code display in the editor, stopping the drag at the line below the class definition (```class ViewController: UIViewController```).

Change the connection from Outlet to Action. Name it buttonPressed. Click Connect.

A new function was created in your source code.

Add ```print("hello world")``` inside of the buttonPressed function. Run your app and click the button. "hello world" should appear in the console.

Remove the print("hello world") line. Inside of the buttonPressed function, type:
```
view.backgroundColor = .white
```

Test your app.


## Conditionals

Between the class definition (```class ViewController: UIViewController```) and your buttonPressed function, add a new variable. Call the variable lightOn and set it's initial value to false.

Inside of the buttonPressed function, write code that will reverse the variable. You could do this with a conditional statement (an if-else). However, you could also simply set lightOn to not lightOn by using the ! logical NOT operator. For example, !True is the same as False

Next, create a conditional that will change the background color. If lightOn is true, then:
```
view.backgroundColor = .white
```
else:
```
view.backgroundColor = .darkGray
```

Test your app.

#### Custom Colors

Change ```.white``` to ```.red``` and notice that there are several autocomplete suggestions:
  - UIColor red <-- a preset red color
  - UIColor systemRed <-- a different red preset
  - UIColor init(red: CGFloat, green: CGFloat, blue: CGFloat, alpha: CGFloat) <-- constructor that allows use to customize the RGB values (and the alpha/opacity)
