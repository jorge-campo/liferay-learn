# Displaying Collections and Collection Pages

> Availability: Liferay Portal 7.3 GA6, DXP 7.3 GA1+

You can display a Collection using a Collection Page or a Collection Display Fragment. For more information about these display options, see [About Collections and Collection Pages](./about-collections-and-collection-pages.md#displaying-collections).

By default, any User can see a Collection's content. However, you can create *Personalized Variations* of these items using Segments. For more information, see [Customizing Collections Using Segments](./customizing-collections-using-segments.md).

```note::
   Before displaying a Collection, you must create one. For more information, see `Creating Collections <./creating-collections.md>`_.
```

## Displaying Collections Using a Collection Page

A Collection Page links a page to a Collection.

1. Go to *Site Administration* &rarr; *Site Builder* &rarr; *Pages*.
1. Click the *New Page* button (![New Page](../../images/icon-plus.png)) at the level where you want to add the new page, and select *Add Collection Page*.

   ![Create a new Collection Page from the Pages Administration.](./displaying-collections-and-collection-pages/images/01.png)

1. From the *Collections* tab, select one of your Collections.
1. Select the *Master Page* you want to use.
1. Enter the *Name* of your Collection Page and click *Add*.
1. To show the Collection, map its content to page elements. See the [Mapping the Collection Items](#mapping-the-collection-items-in-the-page-editor) section.

```important::
   You cannot create a child page under a Collection Page.
```

## Displaying Collections Using a Collection Display Fragment

A Collection Display Fragment that shows a Collection in a Content Page.

1. Go to *Site Administration* &rarr; *Site Builder* &rarr; *Pages*.
1. If you want to create a new Content Page to show the Collection Display Fragment, click the *New Page* button (![New Page](../../images/icon-plus.png)) at the level where you want to add the new page, and select *Add Page*.
1. If you want to add the Collection Display Fragment to an existing page, click the *Actions* (![Actions](../../images/icon-actions.png)) button next to the page and select *Edit*.

    ![Edit an existing page to configure the Display Fragment.](./displaying-collections-and-collection-pages/images/09.png)

1. Click on the *Fragments and Widgets* (![Fragment and Widgets](../../images/icon-view-type-cards.png)) button.
1. In the *Fragments* column, under the *Content Display* section, drag the *Collection Display* fragment onto the page editor.

    ![Drag and drop the Collection Display Fragment onto your page.](./displaying-collections-and-collection-pages/images/03.png)

1. Click on the *Collection Display* Fragment to access its *Configuration*.
1. Click on the *Add* (![Add Collection](../../images/icon-plus.png)) icon next to the *Collection* field.

    ![Add your Collection to the page.](./displaying-collections-and-collection-pages/images/04.png)

1. Click the *Collection* you want to show on your page.
1. If you want to include additional items in the Collection Page, click the *Add* button (![Add](../../images/icon-add-app.png)) on the top of the page and add the items.

    ![You can add additional web content to your Collection Page.](./displaying-collections-and-collection-pages/images/10.gif)

1. To show the Collection, map its content to page elements. See the [Mapping the Collection Items](#mapping-the-collection-items) section.

## Mapping the Collection Items

1. In the Page Editor, click the *Collection Display* representing your Collection.
1. In the tools sidebar, click the *Fragments and Widgets* (![Fragment and Widgets](../../images/icon-view-type-cards.png)) button.
1. From the *Fragments and Widgets* sidebar panel, drag and drop the elements you want to use to show the Collection items.

    ![Add fragments or widgets to the Collection Display and configure the display properties.](./displaying-collections-and-collection-pages/images/06.gif)

    ```note::
        If the Collection Display contains more than one item, you can drag the Fragment or Widget to any of them. The rest of the items in your Collection automatically use the same layout settings.
    ```

1. Click the Fragment or Widget on the Collection Display.
1. Click again to access the mapping options.
1. In the *Mapping* column, select the *Field* that you want to map to your Collection.

    ![Map the fragments and widgets to the Collection items](./displaying-collections-and-collection-pages/images/07.gif)

1. Add more Fragments or Widgets as necessary and map the content to the content Fields.

    ![Add Fragments and Widgets to the Collection Display and map the content fields.](./displaying-collections-and-collection-pages/images/08.gif)

1. Click *Publish*.

## Viewing Collections Usage Throughout the Site

You can find usage statistics for the Collections on your site.

1. Go to *Site Administration* &rarr; *Site Builder* &rarr; *Collections*.
1. Under the *Collections* tab, click on the Actions (![Actions Menu](../../images/icon-actions.png)) menu next to the Collection you want to review and select *View Usages*.

  ![Select View Usages to understand how your Collections are being used through the Site](./displaying-collections-and-collection-pages/images/05.png)

## Liferay DXP 7.2

### Displaying Content Sets

Content Sets are primarily displayed through the Asset Publisher. It is currently the only method to display them out of the box, but you can develop your own external applications or widgets to utilize Content Sets. In [Creating Content Sets](./creating-collections.md#creating-content-sets) you created two Content Sets. Now display them on a page.

#### Configuring the Asset Publisher for Content Sets

To display the Content Sets, start with a blank page, and then add the necessary Asset Publishers and configure them to display the Content Sets.

1. Create a new *Home* page for your site as a Widget Page with a 1 column layout. If you're using a fresh Liferay DXP bundle, you can just remove the *Hello World* widget from the sample *Home* page.
2. Open the *Add* menu and add two *Content Management* &rarr; *Asset Publishers* to the page stacked vertically.
3. Click ![Options](../../images/icon-app-options.png) &rarr; *Configuration* for the top Asset Publisher.
4. Under *Asset Selection* select *Content Set*.

    ![The Asset Publisher has a number of options available for selecting its source for content.](./displaying-collections-and-collection-pages/images/20.png)

5. Open *Select Content Set* and click *Select*.
6. Click on the *Space Program Images* Content Set.
7. Click *Save*.

Now the images will appear at the top of the page. You can manage the way the content is displayed---like what metadata appears---or even create a *Widget Template* to style the content, but the items which display and the order in which they appear are determined by the Content Set.

Now configure the bottom Asset Publisher with the other Content Set.

1. Click ![Options](../../images/icon-app-options.png) &rarr; *Configuration* for the bottom Asset Publisher.
2. Under *Asset Selection* select *Content Set*.
3. Open *Select Content Set* and click *Select*.
4. Click on the *Trending* Content Set.

    ![Select the Content Set you want to use.](./displaying-collections-and-collection-pages/images/21.png)

5. Click *Save*.

Again, you can manage various display settings, but the items which appear and their order are determined by the Content Set criteria.

![You can see the results as the standard Asset Publisher output. You can create Widget Templates to add more style and pizzazz here.](./displaying-collections-and-collection-pages/images/22.png)

#### Adding Items to an existing Content Set

To demonstrate both the management of both static and dynamic Content Sets, upload a new image, tag it, and add it to the static set manually.

1. Upload a new image, and under *Categorization* tag it as *trending*.
2. Without lifting another finger, the image is added to the top of the *Trending* Content List.

    ![The result is dynamically added to the Content List wherever it is displayed.](./displaying-collections-and-collection-pages/images/23.png)

3. To add it to the manual set, go back to *Site Administration* &rarr; *Content & Data* &rarr; *Site Builder*.
4. Click on *Space Program Images* or select ![Options](../../images/icon-options.png) &rarr; *Edit* next to *Space Program Images*.
5. Next to *Asset Entries* click *Select* &rarr; *Basic Document*.
6. Select the new image and click *Add*.
7. Navigate back to the *Home* page to see your image added to the list.

Content Sets are a powerful feature which provide one place to easily define content and other assets to be displayed all over your site. Their reusability also means less repeated work involved in getting great content delivered to your users.

## Related Information

- [Creating Collections](./creating-collections.md)
- [About Collections and Collection Pages](./about-collections-and-collection-pages.md)
- [Personalizing Collections](../../site-building/personalizing-site-experience/experience-personalization/personalizing-collections.md)
