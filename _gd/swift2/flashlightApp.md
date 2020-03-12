---
layout: project
category: swift2
title: Flashlight
---
_Note: the following directions were created for Xcode version 11.3_

* TOC
{:toc}

In the welcome window, click "Create a new Xcode project" (or choose File > New > Project).
Xcode displays template choices in a new window.
In the iOS section at the top of the dialog, click Single View App under the Application section and then click Next.

In the dialog that appears, type a Product Name such as "Flashlight App" and then you ```MUST``` make sure that the User Interface is set to "Storyboard" (not "SwiftUI"). For the organization identifier, use com.example

## The First Flashlight App

When the iPhone was first released there was no flash and no way to easily use it as a flashlight. One of the most popular apps when the App Store launched in 2008 was Flashlight, an app that simply set the screen background to white.

## Add A Button

Drag a button into the Scene from the Object Library. In the Attributes inspector (the slider icon that kinda looks like a shield icon), increase the button's font size to 40 or 50.

#### Open the Assistant Editor

Click on Main.storyboard in the Navigator, click the Editor drop-down menu and then select Assistant. Xcode should have automatically opened the ViewController.swift file for you to edit on the right. IF IT OPENED THE WRONG FILE you can drag ViewController.swift from the Navigator area to the top of the new Editor window on the right.

![Click Editor DropDown Then Assistant](/gd/swift/img/ClickEditorDropDownThenAssistant.gif)

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

#### Create a buttonPressed action

While holding the Control button, drag from the button on your canvas to the code display in the editor, stopping the drag at the line below the class definition (```class ViewController: UIViewController```).

Change the connection from Outlet to Action. Name it buttonPressed. Click Connect.

![Creating The ButtonPressed Action](/gd/swift/img/CreatingTheButtonPressedAction.gif)

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

Change ```.white``` to ```.red``` and notice that there are _several_ autocomplete suggestions, including:
  - UIColor red <-- a preset red color
  - UIColor systemRed <-- a different red preset
  - UIColor init(red: CGFloat, green: CGFloat, blue: CGFloat, alpha: CGFloat) <-- a constructor that allows use to customize the RGB values (and the alpha/opacity)

Open the Developer Documentation and search for UIColor. Scroll down to "Creating a Color from Component Values" and notice that there are UIColor constructors for HSB and RGB.

Let's use both.

At the top of the view controller class (just below the lightOn variable declaration and initialization) create a variable called darkColor and another called lightColor. Use the UIColor constructor that takes RGB values:
```
var darkColor = UIColor(red:0.9, green:0.5, blue:0.9, alpha:1.0)
```
Those RGB values will create a bright pink color, edit them so that you get a custom dark color. Replace ```.darkGray``` with darkColor

Use the UIColor constructor that takes HSB values to construct a lightColor. If lightOn is true, then set view.backgroundColor to be lightColor

## Outlets

Outlets offer a way to reference interface objects (on your storyboard) in your source code. We will creating an outlet for the button. The text of the button currently says "Button" but it would be really nice if it said "ON" and then switched to say "OFF"

#### Create an outlet for the button object

If you need to re-open the Assistant Editor... click on Main.storyboard in the Navigator, click the Editor drop-down menu and then select Assistant. Xcode should automatically open the ViewController.swift file for you to edit on the right. If it opened the wrong file, you can drag ViewController.swift from the Navigator area to the top of the new Editor window on the right.

While holding the Control button, drag from the button on your canvas to the code display in the editor on the right, stopping the drag at the line below the class definition (```class ViewController: UIViewController```).

![control Drag From Button To Create An Outlet](/gd/swift/img/controlDragFromButtonToCreateAnOutlet.png)

The outlet dialog appears. For Name, type flashlightButton

![the Outlet Dialog For Flashlight Button](/gd/swift/img/theOutletDialogForFlashlightButton.png)

Click Connect.

#### Setting the Button title

We now a variable flashlightButton that contains a reference to the button object.

In the buttonPressed function, type ```flashlightButton.``` and notice all of the available methods. Type type ```flashlightButton.set``` to see the "setters" which include setImage(), setTitle(), setTitleColor(), and more. We will use the setTitle method.

If lightOn, set the title of flashlightButton to be ```"TURN OFF", for: .normal```

_for_ is a required parameter that wants to know what UI State this will apply to. The state could be disabled, focused, highlighted, or many others. We just need ```for: .normal```

Test your app. Resize the button borders so that the button object extends from the left edge to the right edge.

## Update UI

Before we finish, let's organize our code. The buttonPressed function is growing longer and it would simplify our program if we created a function called updateUI. You can define this function just below the buttonPressed function.
```
func updateUI(){

}
```
Move the following code into updateUI... the lightOn if-else block, the code that changes view.backgroundColor, and the code that sets the title of flashlightButton.

Add the other button title change so that if the light is off, updateUI will set the title of flashlightButton to be ```"TURN ON", for: .normal```

The buttonPressed is now so much more readable and concise:
```
@IBAction func buttonPressed(_ sender: Any) {
      lightOn = !lightOn
      updateUI()
}
```

In override func viewDidLoad()...
remove ```view.backgroundColor = .darkGray``` and call updateUI() so that background color gets set and the button says TURN ON as soon as the app loads.

## Count Taps and Change the 'On' Color

The final requirement for this project is to create a counter and change the 'on' color after 5 or more taps. Select any color (other than black or white) and use that color if the counter is greater than 5 and the light is on.
