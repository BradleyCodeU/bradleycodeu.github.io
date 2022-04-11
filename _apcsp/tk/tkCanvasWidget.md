---
layout: project
category: tk
title: Tk Canvas Widget
---

The Tkinter Canvas Widget
=========================

The **Canvas** widget provides structured graphics facilities for Tkinter. This is a highly versatile widget which can be used to draw graphs and plots, create graphics editors, and implement various kinds of custom widgets.

When to use the Canvas Widget [#](#when-to-use "bookmark!")
-----------------------------------------------------------

The canvas is a general purpose widget, which is typically used to display and edit graphs and other drawings.

Another common use for this widget is to implement various kinds of custom widgets. For example, you can use a canvas as a completion bar, by drawing and updating a rectangle on the canvas.

Patterns [#](#patterns "bookmark!")
-----------------------------------

To draw things in the canvas, use the **create** methods to add new items.
```
from Tkinter import \*

master = Tk()

w = Canvas(master, width=200, height=100)
w.pack()

w.create\_line(0, 0, 200, 100)
w.create\_line(0, 100, 200, 0, fill="red", dash=(4, 4))

w.create\_rectangle(50, 25, 150, 75, fill="blue")

mainloop()
```
Note that items added to the canvas are kept until you remove them. If you want to change the drawing, you can either use methods like **coords**, **itemconfig**, and **move** to modify the items, or use **delete** to remove them.
```
i = w.create\_line(xy, fill="red")

w.coords(i, new\_xy) \# change coordinates
w.itemconfig(i, fill="blue") \# change color

w.delete(i) \# remove

w.delete(ALL) \# remove all items
```
Concepts [#](#concepts "bookmark!")
-----------------------------------

To display things on the canvas, you create one or more _canvas items_, which are placed in a stack. By default, new items are drawn on top of items already on the canvas.

Tkinter provides lots of methods allowing you to manipulate the items in various ways. Among other things, you can attach (_bind_) event callbacks to individual canvas items.

### Canvas Items [#](#canvas-items "bookmark!")

The **Canvas** widget supports the following standard items:

*   [**arc**](#Tkinter.Canvas.create_arc-method) (arc, chord, or pieslice)
*   [**bitmap**](#Tkinter.Canvas.create_bitmap-method) (built-in or read from XBM file)
*   [**image**](#Tkinter.Canvas.create_image-method) (a [BitmapImage](bitmapimage.htm) or [PhotoImage](photoimage.htm) instance)
*   [**line**](#Tkinter.Canvas.create_line-method)
*   [**oval**](#Tkinter.Canvas.create_oval-method) (a circle or an ellipse)
*   [**polygon**](#Tkinter.Canvas.create_polygon-method)
*   [**rectangle**](#Tkinter.Canvas.create_rectangle-method)
*   [**text**](#Tkinter.Canvas.create_text-method)
*   [**window**](#Tkinter.Canvas.create_window-method)

Chords, pieslices, ovals, polygons, and rectangles consist of both an outline and an interior area, either of which can be made transparent (and if you insist, you can make both transparent).

Window items are used to place other Tkinter widgets on top of the canvas; for these items, the Canvas widget simply acts like a geometry manager.

You can also write your own item types in C or C++ and plug them into Tkinter via Python extension modules.

### Coordinate Systems [#](#coordinate-systems "bookmark!")

The **Canvas** widget uses two coordinate systems; the window coordinate system (with (0, 0) in the upper left corner), and a canvas coordinate system which specify where the items are drawn. By scrolling the canvas, you can specify which part of the canvas coordinate system to show in the window.

The **scrollregion** option is used to limit scrolling operations for the canvas. To set this, you can usually use something like:

    canvas.config(scrollregion=canvas.bbox(ALL))

To convert from window coordinates to canvas coordinates, use the [**canvasx**](#Tkinter.Canvas.canvasx-method) and [**canvasy**](#Tkinter.Canvas.canvasy-method) methods:
```
def callback(event):
    canvas = event.widget
    x = canvas.canvasx(event.x)
    y = canvas.canvasy(event.y)
    print canvas.find\_closest(x, y)
```
### Item Specifiers: Handles and Tags [#](#item-specifiers "bookmark!")

The **Canvas** widget allows you to identify items in several ways. Everywhere a method expects an item specifier, you can use one of the following:

*   item handles (integers)
*   tags
*   **ALL**
*   **CURRENT**

**Item handles** are integer values used to identify a specific item on the canvas. Tkinter automatically assigns a new handle to each new item created on the canvas. Item handles can be passed to the various canvas methods either as integers or as strings.

**Tags** are symbolic names attached to items. Tags are ordinary strings, and they can contain anything except whitespace (as long as they don’t look like item handles).

An item can have zero or more tags associated with it, and the same tag can be used for more than one item. However, unlike the **Text** widget, the **Canvas** widget doesn’t allow you to create bindings or otherwise configure tags for which there are no existing items. Tags are owned by the items, not the widget itself. All such operations are ignored.

You can either specify the tags via an option when you create the item, set them via the [**itemconfig**](#Tkinter.Canvas.itemconfig-method) method, or add them using the [**addtag\_withtag**](#Tkinter.Canvas.addtag_withtag) method. The **tags** option takes either a single tag string, or a tuple of strings.
```
item = canvas.create\_line(0, 0, 100, 100, tags="uno")
canvas.itemconfig(item, tags=("one", "two"))
canvas.addtag\_withtag("three", "one")
```
To get all tags associated with a specific item, use **gettags**. To get the handles for all items having a given tag, use **find\_withtag**.
```
\>>> print canvas.gettags(item)
('one', 'two', 'three')
>>> print canvas.find\_withtag("one")
(1,)
```
The **Canvas** widget also provides two predefined tags:

**ALL** (or the string “all”) matches all items on the canvas.

**CURRENT** (or “current”) matches the item under the mouse pointer, if any. This can be used inside mouse event bindings to refer to the item that triggered the callback.

### Printing [#](#printing "bookmark!")

The Tkinter widget supports printing to Postscript printers.

Performance Issues [#](#performance-issues "bookmark!")
-------------------------------------------------------

The **Canvas** widget implements a straight-forward damage/repair display model. Changes to the canvas, and external events such as **Expose**, are all treated as “damage” to the screen. The widget maintains a **dirty rectangle** to keep track of the damaged area.

When the first damage event arrives, the canvas registers an idle task (using **after\_idle**) which is used to “repair” the canvas when the program gets back to the Tkinter main loop. You can force updates by calling the **update\_idletasks** method.

When it’s time to redraw the canvas, the widget starts by allocating a pixmap (on X windows, this is an image memory stored on the display) with the same size as the dirty rectangle.

It then loops over the canvas items, and redraws _all_ items for which the bounding box touch the dirty rectangle (this means that diagonal lines may be redrawn also if they don’t actually cover the rectangle, but this is usually no big deal).

Finally, the widget copies the pixmap to the display, and releases the pixmap. The copy operation is a very fast operation on most modern hardware.

Since the canvas uses a _single_ dirty rectangle, you can sometimes get better performance by forcing updates. For example, if you’re changing things in different parts of the canvas without returning to the main loop, adding explicit calls to **update\_idletasks()** allows the canvas to update a few small rectangles, instead of a large one with many more objects.

Reference [#](#reference "bookmark!")
-------------------------------------

**Canvas(master=None, \*\*options)** (class) \[[#](#Tkinter.Canvas-class)\]

A structured graphics canvas.

_master_

Parent widget.

_\*\*options_

Widget options. See the description of the [**config**](#canvas.Canvas.config-method) method for a list of available options.



**addtag(tag, method, \*args)** \[[#](#Tkinter.Canvas.addtag-method)\]

Adds a tag to a number of items. Application code should use more specific methods wherever possible (that is, use [**addtag\_above**](#canvas.Canvas.addtag_above-method) instead of **addtag(“above”)**, and so on.

_tag_

The tag to add.

_method_

How to add a new tag. This can be one of “above”, “all”, “below”, “closest”, “enclosed”, “overlapping” or “withtag”.

_\*args_

Additional arguments. For details, see the description of the individual method.



**addtag\_above(tag, item)** \[[#](#Tkinter.Canvas.addtag_above-method)\]

Adds a tag to the item just above the given item.

_tag_

The tag to add.

_item_

The tag or id of the reference item.



**addtag\_all(tag)** \[[#](#Tkinter.Canvas.addtag_all-method)\]

Adds a tag to all items on the canvas. This is a shortcut for **addtag\_withtag(newtag, ALL)**.

_tag_

The tag to add.



**addtag\_below(tag, item)** \[[#](#Tkinter.Canvas.addtag_below-method)\]

Adds a tag to the item just below the given item.

_tag_

The tag to add.

_item_

The tag or id of the reference item.



**addtag\_closest(tag, x, y, halo=None, start=None)** \[[#](#Tkinter.Canvas.addtag_closest-method)\]

Adds a tag to the item closest to the given coordinate. Note that the position is given in canvas coordinates, and that this method always succeeds if there’s at least one item in the canvas. To add tags to items within a certain distance from the position, use [**add\_overlapping**](http://web.archive.org/web/20200412210917/link:Canvas.add_overlapping) (dead link) with a small rectangle centered on the position.

_tag_

The tag to add.

_x_

The horizontal coordinate.

_y_

The vertical coordinate.

_halo_

Optional halo distance.

_start_

Optional start item.



**addtag\_enclosed(tag, x1, y1, x2, y2)** \[[#](#Tkinter.Canvas.addtag_enclosed-method)\]

Adds a tag to all items enclosed by the given rectangle.

_tag_

The tag to add.

_x1_

Left coordinate.

_y1_

Top coordinate.

_x2_

Right coordinate.

_y2_

Bottom coordinate.



**addtag\_overlapped(tag, x1, y1, x2, y2)** \[[#](#Tkinter.Canvas.addtag_overlapping-method)\]

Adds a tag to all items overlapping the given rectangle. This includes items that are completely enclosed by it.

_tag_

The tag to add.

_x1_

Left coordinate.

_y1_

Top coordinate.

_x2_

Right coordinate.

_y2_

Bottom coordinate.



**addtag\_withtag(tag, item)** \[[#](#Tkinter.Canvas.addtag_withtag-method)\]

Adds a tag to all items having the given tag.

_tag_

The tag to add.

_item_

The reference item. If a tag is given, the new tag is added to all items that have this tag. You can also give an id, to add a tag to a single item.



**bbox(item=None)** \[[#](#Tkinter.Canvas.bbox-method)\]

Returns the bounding box for all matching items. If the tag is omitted, the bounding box for all items is returned. Note that the bounding box is approximate and may differ a few pixels from the real value.

_item_

Item specifier. If omitted, the bounding box for all elements on the canvas.

Returns:

The bounding box, as a 4-tuple.



**canvasx(x, gridspacing=None)** \[[#](#Tkinter.Canvas.canvasx-method)\]

Converts a window coordinate to a canvas coordinate.

_x_

Screen coordinate.

_gridspacing_

Optional grid spacing. The coordinate is rounded to the nearest grid coordinate.

Returns:

Canvas coordinate.



**canvasy(y, gridspacing=None)** \[[#](#Tkinter.Canvas.canvasy-method)\]

Converts a window coordinate to a canvas coordinate.

_y_

Screen coordinate.

_gridspacing_

Optional grid spacing. The coordinate is rounded to the nearest grid coordinate.

Returns:

Canvas coordinate.



**config(\*\*options)** \[[#](#Tkinter.Canvas.config-method)\]

Modifies one or more widget options. If no options are given, the method returns a dictionary containing all current option values.

_\*\*options_

Widget options.

_background=_

Canvas background color. Defaults to the standard widget background color. (the database name is background, the class is Background)

_bg=_

Same as **background**.

_borderwidth=_

Width of the canvas border. The default is 0 (no border). (borderWidth/BorderWidth)

_bd=_

Same as **borderwidth**.

_closeenough=_

The default value is 1. (closeEnough/CloseEnough)

_confine=_

The default value is 1. (confine/Confine)

_cursor=_

The cursor to use when the mouse is moved over the canvas. (cursor/Cursor)

_height=_

Canvas width. Default value is ‘7c’. (height/Height)

_highlightbackground=_

The color to use for the highlight border when the canvas does not have focus. The default is system specific. (highlightBackground/HighlightBackground)

_highlightcolor=_

The color to use for the highlight border when the canvas has focus. The default is system speciific. (highlightColor/HighlightColor)

_highlightthickness=_

The width of the highlight border. The default is system specific (usually one or two pixels). (highlightThickness/HighlightThickness)

_insertbackground=_

The color to use for the text insertion cursor. The default is system specific. (insertBackground/Foreground)

_insertborderwidth=_

Width of the insertion cursor’s border. If this is set to a non-zero value, the cursor is drawn using the **RAISED** border style. (insertBorderWidth/BorderWidth)

_insertofftime=_

Together with **insertontime**, this option controls cursor blinking. Both values are given in milliseconds. (insertOffTime/OffTime)

_insertontime=_

See **insertofftime**. (insertOnTime/OnTime)

_insertwidth=_

Width of the insertion cursor. Usually one or two pixels. (insertWidth/InsertWidth)

_offset=_

Default value is ‘0,0’. (offset/Offset)

_relief=_

Border style. The default is **FLAT**. Other possible values are **SUNKEN**, **RAISED**, **GROOVE**, and **RIDGE**. (relief/Relief)

_scrollregion=_

Canvas scroll region. No default value. (scrollRegion/ScrollRegion)

_selectbackground=_

Selection background color. The default is system and display specific. (selectBackground/Foreground)

_selectborderwidth=_

Selection border width. The default is system specific. (selectBorderWidth/BorderWidth)

_selectforeground=_

Selection text color. The default is system specific. (selectForeground/Background)

_state=_

Canvas state. One of NORMAL, DISABLED, or HIDDEN. The default is NORMAL. Note that this is a global setting, but individual canvas items can use the item-level **state** option to override this setting. (state/State)

_takefocus=_

Indicates that the user can use the **Tab** key to move to this widget. Default is an empty string, which means that the canvas widget accepts focus only if it has any keyboard bindings. (takeFocus/TakeFocus)

_width=_

Canvas width. Default value is ‘10c’. (width/Width)

_xscrollcommand=_

Used to connect a canvas to a horizontal scrollbar. This option should be set to the **set** method of the corresponding scrollbar. (xScrollCommand/ScrollCommand)

_xscrollincrement=_

Default value is 0. (xScrollIncrement/ScrollIncrement)

_yscrollcommand=_

Used to connect a canvas to a vertical scrollbar. This option should be set to the **set** method of the corresponding scrollbar. (yScrollCommand/ScrollCommand)

_yscrollincrement=_

Default value is 0. (yScrollIncrement/ScrollIncrement)



**coords(item, \*coords)** \[[#](#Tkinter.Canvas.coords-method)\]

Returns the coordinates for an item.

_item_

Item specifier (tag or id).

_\*coords_

Optional list of coordinate pairs. If given, the coordinates will replace the current coordinates for all matching items.

Returns:

If no coordinates are given, this method returns the coordinates for the matching item. If the item specifier matches more than one item, the coordinates for the first item found is returned.



**create\_arc(bbox, \*\*options)** \[[#](#Tkinter.Canvas.create_arc-method)\]

Draws an arc, pieslice, or chord on the canvas. The new item is drawn on top of the existing items.

_bbox_

Bounding box for the full arc.

_\*\*options_

Arc options.

_activedash=_

_activefill=_

Fill color to use when the mouse pointer is moved over the item, if different from **fill**.

_activeoutline=_

_activeoutlinestipple=_

_activestipple=_

_activewidth=_

Default is 0.0.

_dash=_

Outline dash pattern, given as a list of segment lengths. Only the odd segments are drawn.

_dashoffset=_

Default is 0.

_disableddash=_

_disabledfill=_

Fill color to use when the item is disabled, if different from **fill**.

_disabledoutline=_

_disabledoutlinestipple=_

_disabledstipple=_

_disabledwidth=_

Default is 0.0.

_extent=_

The size, relative to the **start** angle. Default is 90.0.

_fill=_

Fill color. An empty string means transparent.

_offset=_

Default is “0,0”.

_outline=_

Outline color. Default is “black”.

_outlineoffset=_

Default is “0,0”.

_outlinestipple=_

Outline stipple pattern.

_start=_

Start angle. Default is 0.0.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_stipple=_

Stipple pattern.

_style=_

One of PIESLICE, CHORD, or ARC. Default is PIESLICE.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

_width=_

Default is 1.0.

Returns:

The item id.



**create\_bitmap(position, \*\*options)** \[[#](#Tkinter.Canvas.create_bitmap-method)\]

Draws a bitmap on the canvas.

_position_

Bitmap position, given as two coordinates.

_\*\*options_

Bitmap options.

_activebackground=_

_activebitmap=_

_activeforeground=_

_anchor=_

Where to place the bitmap relative to the given position. Default is CENTER.

_background=_

Background color, used for pixels that are “off”. Use an empty string to make the background transparent. Default is transparent.

_bitmap=_

The bitmap descriptor. See [**BitmapImage**](bitmapimage.htm) for more information. (To display a **BitmapImage** object, use the [**create\_image**](#canvas.Canvas.create_image-method) function.)

_disabledbackground=_

_disabledbitmap=_

_disabledforeground=_

_foreground=_

Foreground colors, used for pixels that are “on”. Default is “black”.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

Returns:

The item id.



**create\_image(position, \*\*options)** \[[#](#Tkinter.Canvas.create_image-method)\]

Draws an image on the canvas.

_position_

Image position, given as two coordinates.

_\*\*options_

Image options.

_activeimage=_

_anchor=_

Where to place the image relative to the given position. Default is CENTER.

_disabledimage=_

_image=_

The image object. This should be a [**PhotoImage**](photoimage.htm) or [**BitmapImage**](bitmapimage.htm), or a compatible object (such as the PIL PhotoImage). The application must keep a reference to the image object.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

Returns:

The item id.



**create\_line(coords, \*\*options)** \[[#](#Tkinter.Canvas.create_line-method)\]

Draws a line on the canvas.

_coords_

Image coordinates.

_\*\*options_

Line options.

_activedash=_

_activefill=_

Line color to use when the mouse pointer is moved over the item, if different from **fill**.

_activestipple=_

_activewidth=_

Default is 0.0.

_arrow=_

Default is NONE.

_arrowshape=_

Default is “8 10 3”.

_capstyle=_

Default is BUTT.

_dash=_

Dash pattern, given as a list of segment lengths. Only the odd segments are drawn.

_dashoffset=_

Default is 0.

_disableddash=_

_disabledfill=_

Line color to use when the item is disabled, if different from **fill**.

_disabledstipple=_

_disabledwidth=_

Default is 0.0.

_fill=_

Line color. Default is “black”.

_joinstyle=_

Default is ROUND.

_offset=_

Default is “0,0”.

_smooth=_

Default is 0.

_splinesteps=_

Default is 12.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_stipple=_

Stipple pattern.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

_width=_

Default is 1.0.

Returns:

The item id.



**create\_oval(bbox, \*\*options)** \[[#](#Tkinter.Canvas.create_oval-method)\]

Draws an ellipse on the canvas.

_bbox_

Ellipse coordinates.

_\*\*options_

Ellipse options.

_activedash=_

_activefill=_

Fill color to use when the mouse pointer is moved over the item, if different from **fill**.

_activeoutline=_

_activeoutlinestipple=_

_activestipple=_

_activewidth=_

Default is 0.0.

_dash=_

Outline dash pattern, given as a list of segment lengths. Only the odd segments are drawn.

_dashoffset=_

Default is 0.

_disableddash=_

_disabledfill=_

Fill color to use when the item is disabled, if different from **fill**.

_disabledoutline=_

_disabledoutlinestipple=_

_disabledstipple=_

_disabledwidth=_

Default is 0.

_fill=_

Fill color. An empty string means transparent.

_offset=_

Default is “0,0”.

_outline=_

Outline color. Default is “black”.

_outlineoffset=_

Default is “0,0”.

_outlinestipple=_

Outline stipple pattern.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_stipple=_

Stipple pattern.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

_width=_

Default is 1.0.

Returns:

The item id.



**create\_polygon(coords, \*\*options)** \[[#](#Tkinter.Canvas.create_polygon-method)\]

Draws a polygon on the canvas.

_coords_

Polygon coordinates.

_\*\*options_

Polygon options.

_activedash=_

_activefill=_

Fill color to use when the mouse pointer is moved over the item, if different from **fill**.

_activeoutline=_

_activeoutlinestipple=_

_activestipple=_

_activewidth=_

Default is 0.0.

_dash=_

Outline dash pattern, given as a list of segment lengths. Only the odd segments are drawn.

_dashoffset=_

Default is 0.

_disableddash=_

_disabledfill=_

Fill color to use when the item is disabled, if different from **fill**.

_disabledoutline=_

_disabledoutlinestipple=_

_disabledstipple=_

_disabledwidth=_

Default is 0.0.

_fill=_

Fill color. Default is “black”.

_joinstyle=_

Default is ROUND.

_offset=_

Default is “0,0”.

_outline=_

Outline color.

_outlineoffset=_

Default is “0,0”.

_outlinestipple=_

Outline stipple pattern.

_smooth=_

Default is 0.

_splinesteps=_

Default is 12.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_stipple=_

Stipple pattern.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

_width=_

Default is 1.0.

Returns:

The item id.



**create\_rectangle(bbox, \*\*options)** \[[#](#Tkinter.Canvas.create_rectangle-method)\]

Draws a rectangle on the canvas.

_bbox_

Rectangle bounding box.

_\*\*options_

Rectangle options.

_activedash=_

_activefill=_

Fill color to use when the mouse pointer is moved over the item, if different from **fill**.

_activeoutline=_

_activeoutlinestipple=_

_activestipple=_

_activewidth=_

Default is 0.0.

_dash=_

Outline dash pattern, given as a list of segment lengths. Only the odd segments are drawn.

_dashoffset=_

Default is 0.

_disableddash=_

_disabledfill=_

Fill color to use when the item is disabled, if different from **fill**.

_disabledoutline=_

_disabledoutlinestipple=_

_disabledstipple=_

_disabledwidth=_

Default is 0.

_fill=_

Fill color. An empty string means transparent.

_offset=_

Default is “0,0”.

_outline=_

Outline color. Default is “black”.

_outlineoffset=_

Default is “0,0”.

_outlinestipple=_

Outline stipple pattern.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_stipple=_

Stipple pattern.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

_width=_

Default is 1.0.

Returns:

The item id.



**create\_text(position, \*\*options)** \[[#](#Tkinter.Canvas.create_text-method)\]

Draws text on the canvas.

_position_

Text position, given as two coordinates. By default, the text is centered on this position. You can override this with the **anchor** option. For example, if the coordinate is the upper left corner, set the **anchor** to **NW**.

_\*\*options_

Text options.

_activefill=_

Text color to use when the mouse pointer is moved over the item, if different from **fill**.

_activestipple=_

_anchor=_

Where to place the text relative to the given position. Default is CENTER.

_disabledfill=_

Text color to use when the item is disabled, if different from **fill**.

_disabledstipple=_

_fill=_

Text color. Default is “black”.

_font=_

Font specifier. Default is system specific.

_justify=_

Default is LEFT.

_offset=_

Default is “0,0”.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_stipple=_

Stipple pattern.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

_text=_

The text to display.

_width=_

Maximum line length. Lines longer than this value are wrapped. Default is 0 (no wrapping).

Returns:

The item id.



**create\_window(position, \*\*options)** \[[#](#Tkinter.Canvas.create_window-method)\]

Places a Tkinter widget on the canvas. Note that widgets are drawn on top of the canvas (that is, the canvas acts like a geometry manager). You cannot draw other canvas items on top of a widget.

_position_

Window position, given as two coordinates.

_\*\*options_

Window options.

_anchor=_

Where to place the widget relative to the given position. Default is CENTER.

_height=_

Window height. Default is to use the window’s requested height.

_state=_

Item state. One of NORMAL, DISABLED, or HIDDEN.

_tags=_

A tag to attach to this item, or a tuple containing multiple tags.

_width=_

Window width. Default is to use the window’s requested width.

_window=_

Window object.

Returns:

The item id.



**dchars(item, from, to=None)** \[[#](#Tkinter.Canvas.dchars-method)\]

Deletes text from an editable item.

_item_

Item specifier.

_from_

Where to start deleting text.

_to_

Where to stop deleting text. If omitted, a single character is removed.



**delete(item)** \[[#](#Tkinter.Canvas.delete-method)\]

Deletes all matching items. It is not an error to give an item specifier that doesn’t match any items.

_item_

Item specifier (tag or id).



**dtag(item, tag=None)** \[[#](#Tkinter.Canvas.dtag-method)\]

Removes the given tag from all matching items. If the tag is omitted, all tags are removed from the matching items. It is not an error to give a specifier that doesn’t match any items.

_item_

The item specifier (tag or id).

_tag_

The tag to remove from matching items. If omitted, all tags are removed.



**find\_above(item)** \[[#](#Tkinter.Canvas.find_above-method)\]

Returns the item just above the given item.

_item_

Reference item.



**find\_all()** \[[#](#Tkinter.Canvas.find_all-method)\]

Returns all items on the canvas. This method returns a tuple containing the identities of all items on the canvas, with the topmost item last (that is, if you haven’t change the order using [**lift**](#canvas.Canvas.lift-method) or [**lower**](#canvas.Canvas.lower-method), the items are returned in the order you created them). This is shortcut for **find\_withtag(ALL)**.

Returns:

A tuple containing all items on the canvas.



**find\_below(item)** \[[#](#Tkinter.Canvas.find_below-method)\]

Returns the item just below the given item.

_item_

Reference item.



**find\_closest(x, y, halo=None, start=None)** \[[#](#Tkinter.Canvas.find_closest-method)\]

Returns the item closest to the given position. Note that the position is given in canvas coordinates, and that this method always succeeds if there’s at least one item in the canvas. To find items within a certain distance from a position, use [**find\_overlapping**](#canvas.Canvas.find_overlapping-method) with a small rectangle centered on the position.

_x_

Horizontal screen coordinate.

_y_

Vertical screen coordinate.

_halo_

Optional halo distance.

_start_

Optional start item.

Returns:

An item specifier.



**find\_enclosed(x1, y1, x2, y2)** \[[#](#Tkinter.Canvas.find_enclosed-method)\]

Finds all items completely enclosed by the rectangle (x1, y1, x2, y2).

_x1_

Left edge.

_y1_

Upper edge.

_x2_

Right edge.

_y2_

Lower edge.

Returns:

A tuple containing all matching items.



**find\_overlapping(x1, y1, x2, y2)** \[[#](#Tkinter.Canvas.find_overlapping-method)\]

Finds all items that overlap the given rectangle, or that are completely enclosed by it.

_x1_

Left edge.

_y1_

Upper edge.

_x2_

Right edge.

_y2_

Lower edge.

Returns:

A tuple containing all matching items.



**find\_withtag(item)** \[[#](#Tkinter.Canvas.find_withtag-method)\]

Finds all items having the given specifier.

_item_

Item specifier.



**focus(item=None)** \[[#](#Tkinter.Canvas.focus-method)\]

Moves focus to the given item. If the item has keyboard bindings, it will receive all further keyboard events, given that the canvas itself also has focus. It’s usually best to call focus\_set on the canvas whenever you set focus to a canvas item.

To remove focus from the item, call this method with an empty string.

To find out what item that currently has focus, call this method without any arguments.

_item_

Item specifier. To remove focus from any item, use an empty string.

Returns:

If the item specifier is omitted, this method returns the item that currently has focus, or None if no item has focus.



**gettags(item)** \[[#](#Tkinter.Canvas.gettags-method)\]

Gets tags associated with an item.

_item_

Item specifier.

Returns:

A tuple containing all tags associated with the item.



**icursor(item, index)** \[[#](#Tkinter.Canvas.icursor-method)\]

Moves the insertion cursor to the given position. This method can only be used with editable items.

_item_

Item specifier.

_index_

Cursor index.



**index(item, index)** \[[#](#Tkinter.Canvas.index-method)\]

Gets the numerical cursor index corresponding to the given index. Numerical indexes work like Python’s sequence indexes; 0 is just to the left of the first character, and len(text) is just to the right of the last character.

_item_

Item specifier.

_index_

An index. You can use a numerical index, or one of INSERT (the current insertion cursor), END (the length of the text), or SEL\_FIRST and SEL\_LAST (the selection start and end). You can also use the form “@x,y” where x and y are canvas coordinates, to get the index closest to the given coordinate.

Returns:

A numerical index (an integer).



**insert(item, index, text)** \[[#](#Tkinter.Canvas.insert-method)\]

Inserts text into an editable item.

_item_

Item specifier.

_index_

Where to insert the text. This can be either a numerical index or a symbolic constant. See the description of the [**index**](#canvas.Canvas.index-method) method for details. If you insert text at the INSERT index, the cursor is moved along with the text.

_text_

The text to insert.



**itemcget(item, option)** \[[#](#Tkinter.Canvas.itemcget-method)\]

Gets the current value for an item option.

_item_

Item specifier.

_option_

Item option.

Returns:

The option value. If the item specifier refers to more than one item, this method returns the option value for the first item found.



**itemconfig(item, \*\*options)** \[[#](#Tkinter.Canvas.itemconfig-method)\]

Changes one or more options for all matching items.

_item_

Item specifier.

_\*\*options_

Item options.



**itemconfigure(item, \*\*options)** \[[#](#Tkinter.Canvas.itemconfigure-method)\]

Same as [**itemconfig**](#canvas.Canvas.itemconfig-method).

**lift(item, \*\*options)** \[[#](#Tkinter.Canvas.lift-method)\]

(Deprecated) Moves item to top of stack. Same as [**tag\_raise**](#canvas.Canvas.tag_raise-method).

**lower(item, \*\*options)** \[[#](#Tkinter.Canvas.lower-method)\]

(Deprecated) Moves item to bottom of stack. Same as [**tag\_lower**](#canvas.Canvas.tag_lower-method).

**move(item, dx, dy)** \[[#](#Tkinter.Canvas.move-method)\]

Moves matching items by an offset.

_item_

Item specifier.

_dx_

Horizontal offset.

_dy_

Vertical offset.



**postscript(\*\*options)** \[[#](#Tkinter.Canvas.postscript-method)\]

Generates a Postscript rendering of the canvas contents. Images and embedded widgets are not included.

_\*\*options_

Postscript options.



**scale(self, xscale, yscale, xoffset, yoffset)** \[[#](#Tkinter.Canvas.scale-method)\]

Resizes matching items by scale factor. The coordinates for each item are recalculated as ((coord-offset)\*scale+offset); in other words, each item first moved by -offset, then multiplied with the scale factor, and then moved back again. Note that this method modifies the item coordinates; you may loose precision if you use this method several times on the same items.

_xscale_

Horizontal scale.

_yscale_

Vertical scale.

_xoffset_

Horizontal offset, in canvas coordinates.

_yoffset_

Vertical scale, in canvas coordinates.



**scan\_dragto(x, y)** \[[#](#Tkinter.Canvas.scan_dragto-method)\]

Scrolls the widget contents relative to the scanning anchor. The contents are moved 10 times the distance between the anchor and the given position. Use [**scan\_mark**](#canvas.Canvas.scan_mark-method) to set the anchor.

_x_

The horizontal coordinate.

_y_

The vertical coordinate.



**scan\_mark(x, y)** \[[#](#Tkinter.Canvas.scan_mark-method)\]

Sets the scanning anchor. This sets an anchor that can be used for fast scrolling to the given mouse coordinate.

_x_

The horizontal coordinate.

_y_

The vertical coordinate.



**select\_adjust(item, index)** \[[#](#Tkinter.Canvas.select_adjust-method)\]

Adjusts the selection, so that it includes the given index. This method also sets the selection anchor to this position. This is typically used by mouse bindings.

_item_

Item specifier.

_index_

Selection index.



**select\_clear()** \[[#](#Tkinter.Canvas.select_clear-method)\]

Removes the selection, if it is in this canvas widget.

**select\_from(item, index)** \[[#](#Tkinter.Canvas.select_from-method)\]

Sets the selection anchor point. Use [**select\_adjust**](#canvas.Canvas.select_adjust-method) or [**select\_to**](#canvas.Canvas.select_to-method) to extend the selection.

_item_

Item specifier.

_index_

Selection anchor.



**select\_item()** \[[#](#Tkinter.Canvas.select_item-method)\]

Returns the item that owns the text selection for this canvas widget.

Note that this method always returns None in some older versions of Tkinter. To work around this problem, replace the method call with **canvas.tk.call(canvas.\_w, “select”, “item”)**.

Returns:

Item specifier, or None if there’s no selection.



**select\_to(item, index)** \[[#](#Tkinter.Canvas.select_to-method)\]

Modifies the selection so it includes the region between the current selection anchor and the given index. The anchor is set by [**select\_from**](#canvas.Canvas.select_from-method) or [**select\_adjust**](#canvas.Canvas.select_adjust-method).

_item_

Item specifier.

_index_

Selection end point.



**tag\_bind(item, event=None, callback, add=None)** \[[#](#Tkinter.Canvas.tag_bind-method)\]

Adds an event binding to all matching items.

Note that the new bindings are associated with the items, not the tag. For example, if you attach bindings to all items having the **movable** tag, they will only be attached to any existing items with that tag. If you create new items tagged as **movable**, they will not get those bindings.

_item_

The item specifier (tag or id).

_event_

The event specifier.

_callback_

A callable object that takes one argument. This callback is called with an event descriptor, for events matching the given event specifier.

_add_

Usually, the new binding replaces any existing binding for the same event sequence. If this argument is present, and set to “+”, the new binding is added to to any existing binding.



**tag\_lower(item)** \[[#](#Tkinter.Canvas.tag_lower-method)\]

Moves a canvas item to the bottom of the canvas stack. If multiple items match, they are all moved, with their relative order preserved.

This method doesn’t work with window items. To change their order, use **lower** on the widget instance instead.

_item_

Item specifier.



**tag\_raise(item)** \[[#](#Tkinter.Canvas.tag_raise-method)\]

Moves the given item to the top of the canvas stack. If multiple items match, they are all moved, with their relative order preserved.

This method doesn’t work with window items. To change their order, use **lift** on the widget instance instead.

_item_

Item specifier.



**tag\_unbind(self, item, event)** \[[#](#Tkinter.Canvas.tag_unbind-method)\]

Removes the binding, if any, for the given event sequence. This applies to all matching items.

_item_

Item specifier.

_sequence_

Event specifier.



**tkraise(item, \*\*options)** \[[#](#Tkinter.Canvas.tkraise-method)\]

(Deprecated) Same as [**tag\_raise**](#canvas.Canvas.tag_raise-method).

**type(item)** \[[#](#Tkinter.Canvas.type-method)\]

Returns the type of the given item. If item refers to more than one item, this method returns the type of the first item found.

_item_

Item specifier.

Returns:

A string, giving the item type. This can be one of **“arc”**, **“bitmap”**, **“image”**, **“line”**, **“oval”**, **“polygon”**, **“rectangle”**, **“text”**, or **“window”**.



**xview(how, \*args)** \[[#](#Tkinter.Canvas.xview-method)\]

Adjusts the canvas view horizontally.

_how_

How to adjust the canvas. This can be either “moveto” or “scroll”.

_\*args_

Additional arguments. For the “moveto” method, this is a single fraction. For the “scroll” method, this is a unit and a count. For details, see the descriptions of the [**xview\_moveto**](#canvas.Canvas.xview_moveto-method) and [**xview\_scroll**](#canvas.Canvas.xview_scroll-method) methods.



**xview\_moveto(fraction)** \[[#](#Tkinter.Canvas.xview_moveto-method)\]

Adjusts the canvas so that the given offset is at the left edge of the canvas.

_fraction_

Scroll offset. Offset 0.0 is the beginning of the **scrollregion**, 1.0 the end.



**xview\_scroll(number, what)** \[[#](#Tkinter.Canvas.xview_scroll-method)\]

Scrolls the canvas horizontally by the given amount.

_number_

Number of units.

_what_

What unit to use. This can be either **“units”** (small steps) or **“pages”**.



**yview(how, \*args)** \[[#](#Tkinter.Canvas.yview-method)\]

Adjusts the canvas view vertically.

_how_

How to adjust the canvas. This can be either “moveto” or “scroll”.

_\*args_

Additional arguments. For the “moveto” method, this is a single fraction. For the “scroll” method, this is a unit and a count. For details, see the descriptions of the [**yview\_moveto**](#canvas.Canvas.yview_moveto-method) and [**yview\_scroll**](#canvas.Canvas.yview_scroll-method) methods.



**yview\_moveto(fraction)** \[[#](#Tkinter.Canvas.yview_moveto-method)\]

Adjusts the canvas so that the given offset is at the top edge of the canvas.

_fraction_

Scroll offset. Offset 0.0 is the beginning of the **scrollregion**, 1.0 the end.



**yview\_scroll(number, what)** \[[#](#Tkinter.Canvas.yview_scroll-method)\]

Scrolls the canvas vertically by the given amount.

_number_

Number of units.

_what_

What unit to use. This can be either **“units”** (small steps) or **“pages”**.



[back](button.htm) [next](checkbutton.htm)

*   **[::: effbot.org](/web/20200412210917/http://effbot.org/ "Go to effbot.org.")**
*   **[::: tkinterbook :::](. "Go to tkinterbook index page.")**

*   **::: contents**

*   *   [When to use the Canvas Widget](#when-to-use)
    *   [Patterns](#patterns)
    *   [Concepts](#concepts)
    *   *   [Canvas Items](#canvas-items)
        *   [Coordinate Systems](#coordinate-systems)
        *   [Item Specifiers: Handles and Tags](#item-specifiers)
        *   [Printing](#printing)
    *   [Performance Issues](#performance-issues)
    *   [Reference](#reference)

[![A Django site.](/web/20200412210917im_/http://effbot.org/media/img/djangosite80x15.gif "A Django site.")](http://web.archive.org/web/20200412210917/http://www.djangoproject.com/) rendered by a [django](http://web.archive.org/web/20200412210917/http://www.djangoproject.com/) application. hosted by [webfaction](http://web.archive.org/web/20200412210917/http://www.webfaction.com/shared_hosting?affiliate=slab).
