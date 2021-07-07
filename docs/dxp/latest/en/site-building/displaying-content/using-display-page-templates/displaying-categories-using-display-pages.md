# Displaying Categories using Display Pages

> Available: Liferay DXP 7.4+.

Using a [Display Page Template](./about-display-page-templates-and-display-pages.md) you can publish Web Content, Documents, and Blog Entries in a [Display Page](../../../site-building/displaying-content/using-display-page-templates/publishing-content-with-display-pages.md). Starting with Liferay DXP 7.4, you can also publish Categories on a Display Page. This can be useful if you want to showcase multiple products or services that you [organize using Categories](../../../content-authoring-and-management/tags-and-categories/organizing-content-with-categories-and-tags.md). Because Display Pages are ideal to show a catalog of elements in a consistent way, you can use Category-based Display Pages to provide users a consistent experience when browsing your products or services catalog.

## Publishing Categories in Display Pages

You publish Categories in a Display Page in the same way you publish other types of Display Page content. There are two options:

- [Create a Display Page Template](../../creating-pages/building-and-managing-content-pages/adding-elements-to-content-pages.md) for Categories and set this template as the default one.
- Select the Display Page Template of your choice when you [create or edit the Category](../../../content-authoring-and-management/tags-and-categories/defining-categories-and-vocabularies-for-content.md).

You can also assign a Display Page Template to multiple Categories at once. Under Site Administration &rarr; *Categorization* &rarr; *Categories*, check the Categories you want to update and then click the Page (![Page](../../../images/icon-page.png)) icon or, from the top Actions (![Actions](../../../images/icon-actions.png)) menu, select *Assign Display Page Template*.

![Set the Display Page Template as default using the Actions menu.](./displaying-categories-using-display-pages/images/07.png)

## Example: Using Category-Based Navigation on a Display Page

This step-by-step example shows you how to use Categories in combination with a Display Page Template to display the services of a fictional insurance company.

The steps to display your Categories on a Display Page are:

1. [Create and edit the Categories you want to display](#step-1-creating-and-editing-the-categories).
1. [Create the Display Page Template](#step-2-creating-the-display-page-template).
1. [Edit and publish the Display Page Template](#step-3-edit-and-publish-the-display-page-template).

```warning::
   The following example shows how to modify a default Display Page Template. To avoid disruptions to your production Site, complete this procedure on a test Site.
```

### Step 1: Creating and Editing the Categories

Create the Categories if they do not exist yet, and edit them to include the information you want to map on the Display Page. This example creates two new Categories with a description and a picture, each Category corresponding to different service.

1. [Create a new Category](../../content-authoring-and-management/tags-and-categories/defining-categories-and-vocabularies-for-content.md#defininig-categories)) named *Car Insurance*.
1. In the Categories application, click the *Actions* (![Actions](../../../images/icon-actions.png)) menu for your new category and select *Edit*.
1. Click the *Details* tab and add a *Description* of this Category.

    ![Edit the Category and add a Description.](./displaying-categories-using-display-pages/images/01.png)

1. Click the *Images* tab and add an image for the Category using the *Add Image* (![Add Image](../../../images/icon-add.png)) button.
1. Click again on the *Details* tab and then click *Save*.

### Step 2: Creating the Display Page Template

Starting with Liferay DXP 7.4, the Display Page Template includes a new option to use Categories as the Content Type.

1. Go to *Site Administration* &rarr; *Design* &rarr; *Page Templates*.
1. Click *Display Page Templates* and click the *Add* (![Add Image](../../../images/icon-add.png)) button.
1. Select the Master Page Template you want to use for this Display Page Template.

    ```tip::
       Every Page or Page Template requires a Master Page Template. To learn more, read `Master Page Templates <../../site-building/creating-pages/defining-headers-and-footers/master-page-templates.md>`_.
    ```

1. Enter the *Name* of your Display Page Template and in the *Content Type* drop-down menu, select *Category*.

    ![Select Navigation as the Content Type of your new Display Page Template.](./displaying-categories-using-display-pages/images/02.png)

1. Click *Save*.

### Step 3: Edit and publish the Display Page Template

After you create the Display Page Template, you can edit the components mappings and layout.

```tip::
   The Display Page Template editor works like the Content Page Editor. See `Configuring Elements on Content Pages <../../creating-pages/building-and-managing-content-pages/configuring-elements-on-content-pages.md>`_ for more information.
```

This example shows how to map the Category fields using a [Card Fragment](../../creating-pages/building-and-managing-content-pages/page-fragments-user-interface-reference.md).

1. Drag and drop a Container Fragment to the default drop zone.
1. On top of the Container Fragment, drag and drop a new Card Fragment.
1. Click on the *Selection* menu (A) and then click the Card's title (B) to open the Mapping options.
1. In the Mapping area and the *Source* drop-down menu, select *Category* if it's not selected already.
1. Click the *Field* drop-down menu and select *Name* (C) to map your Category's name to the Card's title.

    ![Map the Category fields in the Display Page Template using a Card Fragment.](./displaying-categories-using-display-pages/images/03.png)

1. Repeat the same mapping process for the Card description and Card image. This list summarizes the Card Fragment to Category Field mappings in the example:

    - Title &rarr; Name
    - Content &rarr; Description
    - Image &rarr; Main Image

1. Click *Publish*.
1. Under the *Display Page Templates* list, click the *Actions* (![Actions](../../../images/icon-actions.png)) menu for the new Display Page Template and choose *Mark as Default*.

    ![Set the Display Page Template as default using the Actions menu.](./displaying-categories-using-display-pages/images/04.png)

1. Go to *Site Administration* &rarr; *Categorization* &rarr; *Categories* and select the Vocabulary with the Categories from [Step 1](#step-1-creating-and-editing-the-categories).
1. On any Category, click the *Actions* (![Actions](../../../images/icon-actions.png)) menu and select *View Display Page*.

    ![Open the Display Page for one of the categories using the Actions Menu option.](./displaying-categories-using-display-pages/images/05.png)

The Display Page uses your Display Page Template mappings to show the Category fields. The Display Page URL is unique for the selected Category.

![The Display Page template shows the Category fields and provides a unique URL.](./displaying-categories-using-display-pages/images/06.png)

## Related Information

- [Creating and Managing Display Page Templates](./creating-and-managing-display-page-templates.md)
- [Publishing Content With Display Pages](./publishing-content-with-display-pages.md)
- [Defining Categories and Vocabularies for Content](../../../content-authoring-and-management/tags-and-categories/defining-categories-and-vocabularies-for-content.md).
