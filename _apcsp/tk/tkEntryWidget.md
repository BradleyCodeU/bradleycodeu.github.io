---
layout: project
category: tk
title: Tk Entry Widget
---

The Tkinter Entry Widget
========================

The **Entry** widget is a standard Tkinter widget used to enter or display a single line of text.

When to use the Entry Widget
----------------------------

The entry widget is used to enter text strings. This widget allows the user to enter one line of text, in a single font.

To enter multiple lines of text, use the [**Text**](text.htm) widget.

Patterns [#](#patterns "bookmark!")
-----------------------------------

To add entry text to the widget, use the **insert** method. To replace the current text, you can call **delete** before you insert the new text.
```
e = Entry(master)
e.pack()

e.delete(0, END)
e.insert(0, "a default value")
```
To fetch the current entry text, use the **get** method:
```
s = e.get()
```
You can also bind the entry widget to a **StringVar** instance, and set or get the entry text via that variable:
```
v = StringVar()
e = Entry(master, textvariable=v)
e.pack()

v.set("a default value")
s = v.get()
```
This example creates an Entry widget, and a Button that prints the current contents:
```
from Tkinter import \*

master = Tk()

e = Entry(master)
e.pack()

e.focus\_set()

def callback():
    print e.get()

b = Button(master, text="get", width=10, command=callback)
b.pack()

mainloop()

e = Entry(master, width=50)
e.pack()

text = e.get()

def makeentry(parent, caption, width=None, \*\*options):
    Label(parent, text=caption).pack(side=LEFT)
    entry = Entry(parent, \*\*options)
    if width:
        entry.config(width=width)
    entry.pack(side=LEFT)
    return entry

user = makeentry(parent, "User name:", 10)
password = makeentry(parent, "Password:", 10, show="\*")

content = StringVar()
entry = Entry(parent, text=caption, textvariable=content)

text = content.get()
content.set(text)
```
FIXME: More patterns to be added.

In newer versions, the Entry widget supports custom events. Document them, and add examples showing how to bind them.

Add [ValidateEntry](/web/20200330063512/http://effbot.org/zone/tkinter-entry-validate.htm) subclass as an example?

Concepts
--------

### Indexes

The _Entry_ widget allows you to specify character positions in a number of ways:

*   Numerical indexes
*   **ANCHOR**
*   **END**
*   **INSERT**
*   Mouse coordinates (“@x”)

**Numerical indexes** work just like Python list indexes. The characters in the string are numbered from 0 and upwards. You specify ranges just like you slice lists in Python: for example, (0, 5) corresponds to the first five characters in the entry widget.

**ANCHOR** (or the string “anchor”) corresponds to the start of the selection, if any. You can use the **select\_from** method to change this from the program.

**END** (or “end”) corresponds to the position just after the last character in the entry widget. The range (0, END) corresponds to all characters in the widget.

**INSERT** (or “insert”) corresponds to the current position of the text cursor. You can use the **icursor** method to change this from the program.

Finally, you can use the mouse position for the index, using the following syntax:

    "@%d" % x

where _x_ is given in pixels relative to the left edge of the entry widget.

Reference [#](#reference "bookmark!")
-------------------------------------

**Entry(master=None, \*\*options)** (class) \[[#](#Tkinter.Entry-class)\]

A text entry field.

_master_

Parent widget.

_\*\*options_

Widget options. See the description of the [**config**](#entry.Entry.config-method) method for a list of available options.



**config(\*\*options)** \[[#](#Tkinter.Entry.config-method)\]

Modifies one or more widget options. If no options are given, the method returns a dictionary containing all current option values.

_\*\*options_

Widget options.

_background=_

Widget background. The default is system specific. (the option database name is background, the class is Background)

_bg=_

Same as **background**.

_borderwidth=_

Border width. The default is system specific, but is usually a few pixels. (borderWidth/BorderWidth)

_bd=_

Same as **borderwidth**.

_cursor=_

Widget cursor. The default is a text insertion cursor (typically an “I-beam” cursor, e.g. **xterm**). (cursor/Cursor)

_disabledbackground=_

Background to use when the widget is disabled. If omitted or blank, the standard background is used instead. (disabledBackground/DisabledBackground)

_disabledforeground=_

Text color to use when the widget is disabled. If omitted or blank, the standard foreground is used instead. (disabledForeground/DisabledForeground)

_exportselection=_

If true, selected text is automatically exported to the clipboard. Default is true. (exportSelection/ExportSelection)

_font=_

Widget font. The default is system specific. (font/Font)

_foreground=_

Text color. (foreground/Foreground)

_fg=_

Same as **foreground**.

_highlightbackground=_

Together with **highlightcolor**, this option controls how to draw the focus highlight border. This option is used when the widget doesn’t have focus. The default is system specific. (highlightBackground/HighlightBackground)

_highlightcolor=_

Same as **highlightbackground**, but is used when the widget has focus. (highlightColor/HighlightColor)

_highlightthickness=_

The width of the focus highlight border. Default is typically a few pixels, unless the system indicates focus by modifying the button itself (like on Windows). (highlightThickness/HighlightThickness)

_insertbackground=_

Color used for the insertion cursor. (insertBackground/Foreground)

_insertborderwidth=_

Width of the insertion cursor’s border. If this is set to a non-zero value, the cursor is drawn using the **RAISED** border style. (insertBorderWidth/BorderWidth)

_insertofftime=_

Together with **insertontime**, this option controls cursor blinking. Both values are given in milliseconds. (insertOffTime/OffTime)

_insertontime=_

See **insertofftime**. (insertOnTime/OnTime)

_insertwidth=_

Width of the insertion cursor. Usually one or two pixels. (insertWidth/InsertWidth)

_invalidcommand=_

FIXME. No default. (invalidCommand/InvalidCommand)

_invcmd=_

Same as **invalidcommand**.

_justify=_

How to align the text inside the entry field. Use one of **LEFT**, **CENTER**, or **RIGHT**. The default is **LEFT**. (justify/Justify)

_readonlybackground=_

The background color to use when the state is “readonly”. If omitted or blank, the standard background is used instead. (readonlyBackground/ReadonlyBackground)

_relief=_

Border style. The default is **SUNKEN**. Other possible values are **FLAT**, **RAISED**, **GROOVE**, and **RIDGE**. (relief/Relief)

_selectbackground=_

Selection background color. The default is system and display specific. (selectBackground/Foreground)

_selectborderwidth=_

Selection border width. The default is system specific. (selectBorderWidth/BorderWidth)te

_selectforeground=_

Selection text color. The default is system specific. (selectForeground/Background)

_show=_

Controls how to display the contents of the widget. If non-empty, the widget displays a string of characters instead of the actual contents. To get a password entry widget, set this option to “\*”. (show/Show)

_state=_

The entry state: **NORMAL**, **DISABLED**, or “readonly” (same as **DISABLED**, but contents can still be selected and copied). Default is **NORMAL**. Note that if you set this to **DISABLED** or “readonly”, calls to [**insert**](#entry.Entry.insert-method) and [**delete**](#entry.Entry.delete-method) are ignored. (state/State)

_takefocus=_

Indicates that the user can use the **Tab** key to move to this widget. Default is an empty string, which means that the entry widget accepts focus only if it has any keyboard bindings (default is on, in other words). (takeFocus/TakeFocus)

_textvariable=_

Associates a Tkinter variable (usually a **StringVar**) to the contents of the entry field. (textVariable/Variable)

_validate=_

Specifies when validation should be done. You can use “focus” to validate whenever the widget gets or loses the focus, “focusin” to validate only when it gets focus, “focusout” to validate when it loses focus, “key” on any modification, and ALL for all situations. Default is **NONE** (no validation). (validate/Validate)

_validatecommand=_

A function or method to call to check if the contents is valid. The function should return a true value if the new contents is valid, or false if it isn’t. Note that this option is only used if the **validate** option is not **NONE**. (validateCommand/ValidateCommand)

_vcmd=_

Same as **validatecommand**.

_width=_

Width of the entry field, in character units. Note that this controlS the size on screen; it does not limit the number of characters that can be typed into the entry field. The default width is 20 character. (width/Width)

_xscrollcommand=_

Used to connect an entry field to a horizontal scrollbar. This option should be set to the **set** method of the corresponding scrollbar. (xScrollCommand/ScrollCommand)



**delete(first, last=None)** \[[#](#Tkinter.Entry.delete-method)\]

Deletes the character at index, or within the given range. Use delete(0, END) to delete all text in the widget.

_first_

Start of range.

_last_

Optional end of range. If omitted, only a single character is removed.



**get()** \[[#](#Tkinter.Entry.get-method)\]

Gets the current contents of the entry field.

Returns:

The widget contents, as a string.



**icursor(index)** \[[#](#Tkinter.Entry.icursor-method)\]

Moves the insertion cursor to the given index. This also sets the **INSERT** index.

_index_

Where to move the cursor.



**index(index)** \[[#](#Tkinter.Entry.index-method)\]

Gets the numerical position corresponding to the given index.

_index_

An index.

Returns:

The corresponding numerical index.



**insert(index, string)** \[[#](#Tkinter.Entry.insert-method)\]

Inserts text at the given index. Use insert(INSERT, text) to insert text at the cursor, insert(END, text) to append text to the widget.

_index_

Where to insert the text.

_string_

The text to insert.



**scan\_dragto(x)** \[[#](#Tkinter.Entry.scan_dragto-method)\]

Sets the scanning anchor for fast horizontal scrolling to the given mouse coordinate.

_x_

Current horizontal mouse position.



**scan\_mark(x)** \[[#](#Tkinter.Entry.scan_mark-method)\]

Scrolls the widget contents sideways according to the given mouse coordinate. The text is moved 10 times the distance between the scanning anchor and the new position.

_x_

Current horizontal mouse position.



**select\_adjust(index)** \[[#](#Tkinter.Entry.select_adjust-method)\]

Same as [**selection\_adjust**](#entry.Entry.selection_adjust-method).

**select\_clear()** \[[#](#Tkinter.Entry.select_clear-method)\]

Same as [**selection\_clear**](#entry.Entry.selection_clear-method).

**select\_from(index)** \[[#](#Tkinter.Entry.select_from-method)\]

Same as [**selection\_from**](#entry.Entry.selection_from-method).

**select\_present()** \[[#](#Tkinter.Entry.select_present-method)\]

Same as [**selection\_present**](#entry.Entry.selection_present-method).

**select\_range(start, end)** \[[#](#Tkinter.Entry.select_range-method)\]

Same as [**selection\_range**](#entry.Entry.selection_range-method).

**select\_to(index)** \[[#](#Tkinter.Entry.select_to-method)\]

Same as [**selection\_to**](#entry.Entry.selection_to-method).

**selection\_adjust(index)** \[[#](#Tkinter.Entry.selection_adjust-method)\]

Adjusts the selection to include also the given character. If index is already selected, do nothing.

_index_

The index.



**selection\_clear()** \[[#](#Tkinter.Entry.selection_clear-method)\]

Clears the selection.

**selection\_from(index)** \[[#](#Tkinter.Entry.selection_from-method)\]

Starts a new selection. This also sets the **ANCHOR** index.

_index_

The index.



**selection\_present()** \[[#](#Tkinter.Entry.selection_present-method)\]

Checks if text is selected.

Returns:

A true value if some part of the text is selected.



**selection\_range(start, end)** \[[#](#Tkinter.Entry.selection_range-method)\]

Explicitly sets the selection range. Start must be smaller than end. Use **selection\_range(0, END)** to select all text in the widget.

_start_

Start of selection range.

_end_

End of range.



**selection\_to(index)** \[[#](#Tkinter.Entry.selection_to-method)\]

Selects all text between **ANCHOR** and the given index.

_index_



**xview(index)** \[[#](#Tkinter.Entry.xview-method)\]

Makes sure the given index is visible. The entry view is scrolled if necessary.

_index_

An index.



**xview\_moveto(fraction)** \[[#](#Tkinter.Entry.xview_moveto-method)\]

Adjusts the entry view so that the given offset is at the left edge of the canvas. Offset 0.0 is the beginning of the entry string, 1.0 the end.

_fraction_



**xview\_scroll(number, what)** \[[#](#Tkinter.Entry.xview_scroll-method)\]

Scrolls the entry view horizontally by the given amount.

_number_

Number of units.

_what_

What unit to use. This can be either **“units”** (characters) or **“pages”** (larger steps).



[back](checkbutton.htm) [next](frame.htm)

*   **[::: effbot.org](/web/20200330063512/http://effbot.org/ "Go to effbot.org.")**
*   **[::: tkinterbook :::](. "Go to tkinterbook index page.")**

*   **::: contents**

*   *   [Patterns](#patterns)
    *   [Reference](#reference)

[![A Django site.](/web/20200330063512im_/http://effbot.org/media/img/djangosite80x15.gif "A Django site.")](http://web.archive.org/web/20200330063512/http://www.djangoproject.com/) rendered by a [django](http://web.archive.org/web/20200330063512/http://www.djangoproject.com/) application. hosted by [webfaction](http://web.archive.org/web/20200330063512/http://www.webfaction.com/shared_hosting?affiliate=slab).
