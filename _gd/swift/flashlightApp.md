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

## Add A Button

Drag a button into the Scene from the Object Library.

#### Open the Assistant Editor

Click the "Add Editor On Right" button. You should now have a split-screen. Next, click on the file that you want to open (ViewController.swift) from the Navigator area.

![add Editor To Right](/gd/swift/img/addEditorToRight.gif)

If necessary, you can drag a file from the Navigator area to the top of either Editor window.

Another way to get the same split-screen with Storyboard and Code Editor is to click the Editor drop-down menu and then select Assistant. Xcode automatically picks a file for you to edit on the right, but IF IT OPENED THE WRONG FILE you can drag ViewController.swift from the Navigator area to the top of the new Editor window on the right.

#### Developer Documentation

Click the Window drop-down menu and then Developer Documentation. Search for viewDidLoad

#### Create an outlet
