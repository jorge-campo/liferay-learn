# Content Dashboard Interface

In the Content Dashboard interface, you can find the following areas:

- Content Audit Tool (1)
- Content List (2)
- Information sidebar (3)
- Performance sidebar (4)

![The Content Dashboard user interface](./content-dashboard-interface/images/05.png)

When you access the Content Dashboard page, you can see the [Content Audit Tool](#the-content-audit-tool) at the top of the page and the [Content List area](#the-content-list-area) at the button. From the Content List area, you can access the [Information](#the-information-sidebar) and [Content Performance](#the-content-performance-sidebar) sidebar panels. These panels are collapsable elements that show additional information for each item in the Content List.

To access the Information or Performance sidebar, click the Actions Menu (![Action Menu](../../images/icon-actions.png)) for the content and select the *Info* or *Metrics* option. Alternatively, hover over the article and use the *Info* (![Info](../../images/icon-information.png)) or *Metrics* (![Metrics](../../images/icon-analytics.png)) buttons. From here, you can also *View* (![View](../../images/icon-preview.png)) or *Edit* (![Edit](../../images/icon-edit.png)) the content.

```important::
   To access the metrics for your content in the Performance panel, you must connect the Liferay DXP instance with Liferay Analytics Cloud and synchronize your content. To learn more, see [Connecting Liferay DXP to Analytics Cloud](https://learn.liferay.com/analytics-cloud/latest/en/getting-started/connecting-data-sources/connecting-liferay-dxp-to-analytics-cloud.html).
```

## Opening the Content Dashboard

1. Click on the Global Menu and, under the *Content* area, click *Content Dashboard*.
1. If the Global Menu is disabled, open the Product Menu and, under the *Site* Menu, go to *Content* &rarr; *Content Dashboard*.

![Open the Content Dashboard from the Global Menu](./content-dashboard-interface/images/03.png)

## The Content Audit Tool

This tool is the graphical area at the top of the Content Dashboard page. The chart on this area represents the total number of assets for the combination of categories in the global Vocabularies you select. This chart takes into account:

- Web content articles exclusively, across all Sites and Asset Libraries.
- Web content you have access to.
- The existing [filters](#filtering-and-sorting-content-in-the-content-list-area) in the Content List area.
- A maximum of two global Vocabularies (for the x and y axis.)

![Overview of the Content Audit Tool in the Content Dashboard](./content-dashboard-interface/images/10.png)

```tip::
   If the Content Audit Tool doesn't show the expected chart, [verify your Categories](../tags-and-categories/user-guide/defining-categories-and-vocabularies-for-content.md) for the global Vocabularies and ensure that [your content is categorized](../tags-and-categories/user-guide/organizing-content-with-categories-and-tags.md).
```

In the Content Audit Tool interface you can find:

- Chart legend (1)
- X-axis Categories for the first global Vocabulary (2)
- Y-axis Categories for the second global Vocabulary (3)
- Bar chart (4)

![Open the Content Dashboard from the Global Menu](./content-dashboard-interface/images/04.png)

### Customizing the Vocabularies and Categories in the Content Audit Tool

By default, the bar chart shows the total number of assets for each Category in the selected global Vocabularies, but you can filter this information in different ways:

- Using the filters in the [Content View Area](#the-content-view-area).
- Hiding categories, by clicking the Category name in the chart legend.
- Changing the Vocabularies.

To change the Vocabularies:

1. Click on the *Actions* menu (![Actions Menu](../../images/icon-actions.png)) in the Content Audit area.
1. In the dual listbox, click the Vocabulary in the *Available* or *In Use* lists and click the selection buttons (![Angle Left](../../images/icon-angle-left.png) ![Angle right](../../images/icon-angle-right.png)) to add or remove the Vocabularies you want to show.
1. Click the *Up* (![Up](../../images/Icon-angle-up.png)) and *Down* (![Down](../../images/Icon-angle-down.png)) buttons to order of the Vocabularies in the chart axis.
1. Click Save.

    ![Select the Vocabularies in the Content Audit Tool](./content-dashboard-interface/images/12.png)

```note::
   You can use a maximum of two Vocabularies defined at the Global site level.
```

## The Content List Area

By default, this area shows all the content you have access to, across all sites and Asset Libraries. From here, you can sort and filter this content using built-in or custom filters. The Content Audit Tool chart changes dynamically based on the filters that you set.

In the Content List area you can find:

- Filter and Sort selector (1)
- Filter editor (2)
- Search field (3)
- Content list (4)

![Elements of the Content List area](./content-dashboard-interface/images/06.png)

In the list of contents, you can find the following columns:

| Column | Description |
| --- | --- |
| Title | Article title. When the article is based on a [Display Page Template](../../site-building/displaying-content/using-display-page-templates/displaying-content-with-display-page-templates.md), you can see a page icon next to the title. |
| Author | Author's name. |
| Subtype | Article's [Subcategory](../tags-and-categories/user-guide/defining-categories-and-vocabularies-for-content.md#creating-subcategories) |
| Site or Asset Library | Article location in the Liferay DXP instance. |
| Status | Article workflow status. Articles with more than one version in different statuses show all than statuses. |
| *First Vocabulary* | This is the first Vocabulary in the Content Audit Tool. |
| *Second Vocabulary* | The optional second Vocabulary in the Content Audit Tool. |
| Topic | Shows one of more Categories from the Topic Vocabulary. |
| Modified Date | Date or time of the last article update. |

The ([Page](../../images/icon-page.png)) icon denotes articles based on a [Display Page Template](../../site-building/displaying-content/using-display-page-templates/displaying-content-with-display-page-templates.md).

For each entry in the Content List, you can access the following options using the Actions Menu (![Actions Menu](../../images/icon-actions.png)) or hovering over the article and clicking the corresponding option:

- *View* (![View](../../images/icon-preview.png)): Opens the Display Page in view mode.
- *Edit* (![Edit](../../images/icon-edit.png)): Opens the Display Page in edit mode.
- *Info* (![Information](../../images/icon-information.png)): Opens the [Information sidebar](#information-sidebar).
- *Metrics* (![Edit](../../images/icon-analytics.png)): Opens the [Content Performance sidebar](#the-content-performance-sidebar).

![Access the Information and Performance sidebar from the Actions Menu or the icons on each content row](./content-dashboard-interface/images/11.png)

```note::
   You can use the *View*, *Information*, and *Metrics* options for content based on a Display Page Template. You can use the *Edit* option when you have Edit permission on the content.
```

### Filtering and Sorting Content in the Content List Area

To filter the content:

1. Click the *Filter and Order* drop-down menu.
1. Click on one of the predefined filters or click on a custom filter (denoted by three dots) to create your own filter criteria.
1. Select the content you want to filter by.

The Filter Editor area shows your filters and the total number of results. To remove one or more filters, click the *Close* (![Close](../../images/icon-times.png)) button next to the filter's name, or click *Clear* to remove all the filters and reset the Content List.

![Use the filter editor to remove a specific filter or all of them from the filter area](./content-dashboard-interface/images/01.png)

In addition to the predefined and custom filters, you can search and filter the assets in the Content View using keywords in the Search field.

To sort the content:

1. Click the *Filter and Order* drop-down menu.
1. Under the *Order By* section, select the order for the items.

## The Information Sidebar

This sidebar provides access to different metadata for the asset selected, including the asset owner, available languages for the content, tags and categories for the asset, or review date, among others.

![Access the Information sidebar from the assets in the Content List area](./content-dashboard-interface/images/07.png)

```note::
   You can open the Information Sidebar for assets with a Content Display Page associated. You can identify these assets in the Content List area by the Page icon next to the asset name.
```

To open the Information sidebar panel:

1. Click the Actions Menu (![Actions Menu](../../images/icon-actions.png)) next to the asset and choose *Info*.
1. Alternatively, hover over the asset and click the *Information* (![Information icon](../../images/icon-information.png)) icon.

    ![The Information sidebar provides different information for your content](./content-dashboard-interface/images/09.png)

## The Content Performance Sidebar

This sidebar gathers statistics for your content, like the number of reads and views or the traffic sources.

![Access the Performance sidebar from the assets in the Content List area](./content-dashboard-interface/images/08.png)

You can access the Content Performance info panel for any of the assets in the Content List when the following conditions:

- You have View and Edit permissions for the web content.
- The content is based on Display Page Template.
- The Liferay DXP instance has an active connection to Liferay Analytics Cloud and the your content is synchronized.

```note::
   Metrics for your content are available when these conditions are met (2). If the *Metrics* options does not exist for your content, one or more conditions are not met (2).
```

![Ensure that your content meets the conditions for content metrics](./content-dashboard-interface/images/13.png)

To open the Performance sidebar panel:

1. Click the Actions Menu next to the asset and choose *Performance*.
1. Alternatively, hover over the asset and click the *Analytics* (![Analytics](../../images/icon-analytics.png)) button.

To learn how to analyze your content performance using the Performance area, see [Analyze Content Performance Using the Content Dashboard](./analyze-content-performance-using-content-dashboard.md).

## Related Information

- [About the Content Dashboard](./about-the-content-dashboard.md)
- [Analyze Content Performance Using the Content Dashboard](./analyze-content-performance-using-content-dashboard.md)
- [Defining Categories and Vocabularies for Content](../tags-and-categories/user-guide/defining-categories-and-vocabularies-for-content.md)