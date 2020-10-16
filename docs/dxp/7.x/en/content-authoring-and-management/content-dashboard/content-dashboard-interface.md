# Content Dashboard Interface

The Content Dashboard parts are:

- Content Audit Tool (1)
- Content View area (2)
- Information sidebar panel (3)
- Performance sidebar panel (4)



By default you can see the Chart area on the top and the Content View area on the button. Using the Actions Menu for each content, you can also access the Information and Performance sidebar panels.

The Information and Performance panels are collapsable elements that 

![The Content Dashboard ](./content-dashboard-interface/images/05.png)

To access the performance metrics for your content in the Performance panel, you must have a connection with Liferay Analytics Cloud and the connection must be . To learn more, see ...

By default, the Content Dashboard shows asset information from all sites and asset libraries where you have access.

## Accessing the Content Dashboard

1. Click on the Global Menu and, under the *Content* area, click *Content Dashboard*
1. Alternatively, click

![Open the Content Dashboard from the Global Menu](./content-dashboard-interface/images/03.png)

## The Content Audit Tool

The Content Audit Tool is the area in the top section of the Content Dashboard. Chart area is in the upper side of the Content Dashboard. The chart on this area represents the number of assets for the combination of categories in the global Vocabularies you select.

![Overview of the Content Audit Tool in the Content Dashboard](./content-dashboard-interface/images/10.png)

In this area, you can find:

- Chart legend (1)
- X-axis Categories for the first Vocabularies (2)
- Y-axis Categories for the second Vocabulary (3)
- Bar Chart (4)

![Open the Content Dashboard from the Global Menu](./content-dashboard-interface/images/04.png)

```tip::
   If the chart area does not show the expected graphic, verify your Categories for the default Vocabularies and ensure that your content is categorized.
```

### Customizing the Categories in the [[Graphic Area]]

By default, the bar chart shows the total number of assets for each Category in the selected Vocabularies, but you can update this information in different ways:

- You can filter this data using the filters in the [Content View Area](#the-content-view-area).
- You can also remove the categories in the legend. To do so, click or unclick the category you want to filter in
- You can change the vocabularies 

To customize the Vocabularies:

1. Click on the Action menu (![Actions Menu](../../images/icon-action.png)) in the Content Audit area.
1. In the dual listbox, click the Vocabulary in the Available or *In Use* lists and click the > or < buttons to add or remove the Vocabularies you want to show.

```important::
   You can only use Vocabularies defined at the Global site level.
```

You can show a maximum of two vocabularies.

1. Click Save ?

## The Content View Area

The Content View . The Audit Chart area changes dynamically when you apply one or more filters in the Content View.

In this are of the Content Dashboard we can find:

- Filter and Sort selector (1)
- Filter editor (2)
- Search field (3)
- Content list (4)

![Open the Content Dashboard from the Global Menu](./content-dashboard-interface/images/06.png)

| Column | Description |
| --- | --- |
| Title | cell 2 |
| Author | cell 2 |
| Subtype | Shows the [Category Subtype]() |
| Site or Asset Library | cell 2 |
| Status | cell 2 |
| Audience | Shows one of more Categories from the Audience Vocabulary |
| Topic | Shows one of more Categories from the Topic Vocabulary |
| Modified DAte | Last modified date or time |


### Sorting and Filtering Content in the [[Content View Area]]

By default, the bar chart shows the total number of assets for each Category. You can filter this data using the filters in the [[Content View Area]].

To filter the content:

1. Click the Filter and Order drop-down menu.
1. Click on one of the predefined filters or click of a custom filter (denoted by the three dots) to create your own filtering.
1. Select the content you want to filter by.

When you click in a custom filter (denoted by the three dots (...)), you can configure the . For example, if you click in the The filter editor area shows your filters and the total number of results. To remove one or more filters, click the close button next to the filter's name, or click the Clear button to remove all the filters and see all the available content.

![Remove a specific filter or all of them from the filter area](./content-dashboard-interface/images/01.png)

In addition to the predefined and custom filters, you can search and filter the assets in the Content View are using keywords in the search field.

To sort the content:

1. Click the Filter and Order drop-down menu.
1. Under the *Order By* section, select the order for the items.

## The Information Sidebar Panel

This panel provides access to multiple information for the asset selected, including the asset owner, available languages for the content, tags and categories for the asset, or review date, among others.

![Remove a specific filter or all of them from the filter area](./content-dashboard-interface/images/07.png)

To open the Information sidebar panel:

1. Click the Actions Menu next to the asset and choose *Info*.
1. Alternatively, hover over the asset and click the *Information* (![Information icon](../../images/icon-information.png)) icon.

![Remove a specific filter or all of them from the filter area](./content-dashboard-interface/images/09.png)

## The [[Content Performance Area]]

![Remove a specific filter or all of them from the filter area](./content-dashboard-interface/images/08.png)


You can access the Content Performance info panel for any of the assets in the Content area.

To open the Performance sidebar panel:

1. Click the ActionMenu next to the asset and choose
1. Alternatively hover 

The Content Performance info panel provides access to the following article's information:

- General information
- Engagement
- Search Engines Traffic

The General Information section contains different information for your articles, like article name, URL, publication date, author, and languages the article is translated into.

To learn how to analyze your content performance using the Performance area, see [Analyze Content Performance Using the Content Dashboard](./analyze-content-performance-using-content-dashboard.md).

## Related Information

- [About the Content Dashboard](./about-the-content-dashboard.md)
- [Analyze Content Performance Using the Content Dashboard](./analyze-content-performance-using-content-dashboard.md)
- [Defining Categories and Vocabularies for Content](../tags-and-categories/user-guide/defining-categories-and-vocabularies-for-content.md)