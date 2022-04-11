---
layout: project
category: tk
title: Tk What Is Tkinter
---

What is Tkinter?
===============

The **Tkinter** module (“Tk interface”) is the standard Python interface to the Tk GUI toolkit from [Scriptics](http://web.archive.org/web/20200406095323/http://www.scriptics.com/) (formerly developed by Sun Labs).

Both Tk and Tkinter are available on most Unix platforms, as well as on Windows and Macintosh systems. Starting with the 8.0 release, Tk offers native look and feel on all platforms.

Tkinter consists of a number of modules. The Tk interface is provided by a binary extension module named **\_tkinter**. This module contains the low-level interface to Tk, and should never be used directly by application programmers. It is usually a shared library (or DLL), but might in some cases be statically linked with the Python interpreter.

The public interface is provided through a number of Python modules. The most important interface module is the **Tkinter** module itself. To use Tkinter, all you need to do is to import the **Tkinter** module:
```
import Tkinter
```
Or, more often:
```
from Tkinter import \*
```
The Tkinter module only exports widget classes and associated constants, so you can safely use the **from-in** form in most cases. If you prefer not to, but still want to save some typing, you can use **import-as**:
```
import Tkinter as Tk
```
[back](tkinter-index.htm) [next](tkinter-hello-tkinter.htm)

*   **[::: effbot.org](/web/20200406095323/http://effbot.org/ "Go to effbot.org.")**
*   **[::: tkinterbook :::](. "Go to tkinterbook index page.")**

[![A Django site.](/web/20200406095323im_/http://effbot.org/media/img/djangosite80x15.gif "A Django site.")](http://web.archive.org/web/20200406095323/http://www.djangoproject.com/) rendered by a [django](http://web.archive.org/web/20200406095323/http://www.djangoproject.com/) application. hosted by [webfaction](http://web.archive.org/web/20200406095323/http://www.webfaction.com/shared_hosting?affiliate=slab).

===================



## Hello, Tkinter
==============

But enough talk. Time to look at some code instead.

As you know, every serious tutorial should start with a “hello world”\-type example. In this overview, we’ll show you not only one such example, but two.

First, let’s look at a pretty minimal version:

**Our First Tkinter Program (File: hello1.py)**
```
from Tkinter import \*

root = Tk()

w = Label(root, text="Hello, world!")
w.pack()

root.mainloop()
```
Running the Example
-------------------

To run the program, run the script as usual:
```
$ python hello1.py
```
The following window appears.

**Running the program**

![](data:image/gif;base64, R0lGODdhhAAxAIcAAAAAAIAAAACAAICAAAAAgIAAgACAgICAgMDAwP8AAAD/AP//AAAA//8A/wD/ /////xAQEBERERISEhMTExQUFBUVFRYWFhcXFxgYGBkZGRoaGhsbGxwcHB0dHR4eHh8fHyAgICEh ISIiIiMjIyQkJCUlJSYmJicnJygoKCkpKSoqKisrKywsLC0tLS4uLi8vLzAwMDExMTIyMjMzMzQ0 NDU1NTY2Njc3Nzg4ODk5OTo6Ojs7Ozw8PD09PT4+Pj8/P0BAQEFBQUJCQkNDQ0REREVFRUZGRkdH R0hISElJSUpKSktLS0xMTE1NTU5OTk9PT1BQUFFRUVJSUlNTU1RUVFVVVVZWVldXV1hYWFlZWVpa WltbW1xcXF1dXV5eXl9fX2BgYGFhYWJiYmNjY2RkZGVlZWZmZmdnZ2hoaGlpaWpqamtra2xsbG1t bW5ubm9vb3BwcHFxcXJycnNzc3R0dHV1dXZ2dnd3d3h4eHl5eXp6ent7e3x8fH19fX5+fn9/f4CA gIGBgYKCgoODg4SEhIWFhYaGhoeHh4iIiImJiYqKiouLi4yMjI2NjY6Ojo+Pj5CQkJGRkZKSkpOT k5SUlJWVlZaWlpeXl5iYmJmZmZqampubm5ycnJ2dnZ6enp+fn6CgoKGhoaKioqOjo6SkpKWlpaam pqenp6ioqKmpqaqqqqurq6ysrK2tra6urq+vr7CwsLGxsbKysrOzs7S0tLW1tba2tre3t7i4uLm5 ubq6uru7u7y8vL29vb6+vr+/v8DAwMHBwcLCwsPDw8TExMXFxcbGxsfHx8jIyMnJycrKysvLy8zM zM3Nzc7Ozs/Pz9DQ0NHR0dLS0tPT09TU1NXV1dbW1tfX19jY2NnZ2dra2tvb29zc3N3d3d7e3t/f 3+Dg4OHh4eLi4uPj4+Tk5OXl5ebm5ufn5+jo6Onp6erq6uvr6+zs7O3t7e7u7u/v7/Dw8PHx8fLy 8vPz8/T09PX19fb29vf39/j4+Pn5+fr6+vv7+/z8/P39/f7+/v///ywAAAAAhAAxAEAI/wARCBxI sKDBgwgTKlzIsKHDhwsBIHiAAAGBiwQCaNyokYDHjwEIiBxJsqTJkyhRPkDAsqXLlwgOAHiAoKbN mzgRHABAgMADBECDCh2K4AAAAgQQIDgAAMEDBAgISJ1KoECCBAQIBEjANUCBAATChn3wgIBZAg8e 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 AAgOKF7MuLHjx5AjS55MubLly5IBBAQAOw== )

To stop the program, just close the window.

Details
-------

We start by importing the Tkinter module. It contains all classes, functions and other things needed to work with the Tk toolkit. In most cases, you can simply import everything from **Tkinter** into your module’s namespace:
```
from Tkinter import \*
```
To initialize Tkinter, we have to create a Tk **root** widget. This is an ordinary window, with a title bar and other decoration provided by your window manager. You should only create one root widget for each program, and it must be created before any other widgets.
```
root = Tk()
```
Next, we create a **Label** widget as a child to the root window:
```
w = Label(root, text="Hello, world!")
w.pack()
```
A **Label** widget can display either text or an icon or other image. In this case, we use the **text** option to specify which text to display.

Next, we call the **pack** method on this widget. This tells it to size itself to fit the given text, and make itself visible. However, the window won’t appear until we’ve entered the Tkinter event loop:
```
root.mainloop()
```
The program will stay in the event loop until we close the window. The event loop doesn’t only handle events from the user (such as mouse clicks and key presses) or the windowing system (such as redraw events and window configuration messages), it also handle operations queued by Tkinter itself. Among these operations are geometry management (queued by the **pack** method) and display updates. This also means that the application window will not appear before you enter the main loop.

[back](tkinter-whats-tkinter.htm) [next](tkinter-hello-again.htm)

*   **[::: effbot.org](/web/20200220202055/http://www.effbot.org/ "Go to effbot.org.")**
*   **[::: tkinterbook :::](. "Go to tkinterbook index page.")**

[![A Django site.](/web/20200220202055im_/http://www.effbot.org/media/img/djangosite80x15.gif "A Django site.")](http://web.archive.org/web/20200220202055/http://www.djangoproject.com/) rendered by a [django](http://web.archive.org/web/20200220202055/http://www.djangoproject.com/) application. hosted by [webfaction](http://web.archive.org/web/20200220202055/http://www.webfaction.com/shared_hosting?affiliate=slab).


===================

## Widget classes
--------------

Tkinter supports 15 core widgets:

[**Button**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Button)

A simple button, used to execute a command or other operation.

[**Canvas**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Canvas)

Structured graphics. This widget can be used to draw graphs and plots, create graphics editors, and to implement custom widgets.

[**Checkbutton**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Checkbutton)

Represents a variable that can have two distinct values. Clicking the button toggles between the values.

[**Entry**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Entry)

A text entry field.

[**Frame**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Frame)

A container widget. The frame can have a border and a background, and is used to group other widgets when creating an application or dialog layout.

[**Label**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Label)

Displays a text or an image.

[**Listbox**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Listbox)

Displays a list of alternatives. The listbox can be configured to get radiobutton or checklist behavior.

[**Menu**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Menu)

A menu pane. Used to implement pulldown and popup menus.

[**Menubutton**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Menubutton)

A menubutton. Used to implement pulldown menus.

[**Message**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Message)

Display a text. Similar to the label widget, but can automatically wrap text to a given width or aspect ratio.

[**Radiobutton**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Radiobutton)

Represents one value of a variable that can have one of many values. Clicking the button sets the variable to that value, and clears all other radiobuttons associated with the same variable.

[**Scale**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Scale)

Allows you to set a numerical value by dragging a “slider”.

[**Scrollbar**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Scrollbar)

Standard scrollbars for use with canvas, entry, listbox, and text widgets.

[**Text**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Text)

Formatted text display. Allows you to display and edit text with various styles and attributes. Also supports embedded images and windows.

[**Toplevel**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Toplevel)

A container widget displayed as a separate, top-level window.

In Python 2.3 (Tk 8.4), the following widgets were added:

[**LabelFrame**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.LabelFrame)

A variant of the Frame widget that can draw both a border and a title.

[**PanedWindow**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.PanedWindow)

A container widget that organizes child widgets in resizable panes.

[**Spinbox**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Spinbox)

A variant of the Entry widget for selecting values from a range or an ordered set.

Also note that there’s no widget class hierarchy in Tkinter; all widget classes are siblings in the inheritance tree.

All these widgets provide the **Misc** and geometry management methods, the configuration management methods, and additional methods defined by the widget itself. In addition, the **Toplevel** class also provides the window manager interface. This means that a typical widget class provides some 150 methods.

Mixins
------

The Tkinter module provides classes corresponding to the various widget types in Tk, and a number of mixin and other helper classes (a _mixin_ is a class designed to be combined with other classes using multiple inheritance). When you use Tkinter, you should never access the mixin classes directly.

### Implementation mixins

The [**Misc**](widget.htm) class is used as a mixin by the root window and widget classes. It provides a large number of Tk and window related services, which are thus available for all Tkinter core widgets. This is done by _delegation_; the widget simply forwards the request to the appropriate internal object.

The [**Wm**](wm.htm) class is used as a mixin by the root window and [**Toplevel**](/web/20200224052647/http://www.effbot.org/tag/Tkinter.Toplevel) widget classes. It provides window manager services, also by delegation.

Using delegation like this simplifies your application code: once you have a widget, you can access all parts of Tkinter using methods on the widget instance.

### Geometry mixins

The [**Grid**](grid.htm), [**Pack**](pack.htm), and [**Place**](place.htm) classes are used as mixins by the widget classes. They provide access to the various geometry managers, also via delegation.

[**Grid**](grid.htm)

The grid geometry manager allows you to create table-like layouts, by organizing the widgets in a 2-dimensional grid. To use this geometry manager, use the **grid** method.

[**Pack**](pack.htm)

The pack geometry manager lets you create a layout by “packing” the widgets into a parent widget, by treating them as rectangular blocks placed in a frame. To use this geometry manager for a widget, use the **pack** method on that widget to set things up.

[**Place**](place.htm)

The place geometry manager lets you explicitly place a widget in a given position. To use this geometry manager, use the **place** method.

### Widget configuration management

The **Widget** class mixes the **Misc** class with the geometry mixins, and adds configuration management through the **cget** and **configure** methods, as well as through a partial dictionary interface. The latter can be used to set and query individual options, and is explained in further detail in the next chapter.

[back](tkinter-hello-again.htm) [next](tkinter-widget-configuration.htm)

*   **[::: effbot.org](/web/20200224052647/http://www.effbot.org/ "Go to effbot.org.")**
*   **[::: tkinterbook :::](. "Go to tkinterbook index page.")**

[![A Django site.](/web/20200224052647im_/http://www.effbot.org/media/img/djangosite80x15.gif "A Django site.")](http://web.archive.org/web/20200224052647/http://www.djangoproject.com/) rendered by a [django](http://web.archive.org/web/20200224052647/http://www.djangoproject.com/) application. hosted by [webfaction](http://web.archive.org/web/20200224052647/http://www.webfaction.com/shared_hosting?affiliate=slab).
