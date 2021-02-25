# Content Page Personalization and Management

You can tailor your Content Page to different groups of users, providing each group a personalized experience, rather than a generic one. You can also leverage Content Page personalization to conduct A/B Testing (for more information, see [Content Page Experiences and A/B Testing](#content-page-experiences-and-ab-testing)).

Personalizing your Content page for different users is a two-step process:

1. [Define a Segment](../segmentation/creating-and-managing-user-segments.md) for the users you want to provide a personalized experience.
2. [Create a Experience](#creating-a-new-content-page-experience) with customized content for your Segment.

## Understanding How Experiences Work

You can create multiple experiences for the same Content Page, each experience covering a particular need. For example, you can create different experiences for users who log in to your site and for users who browse the site anonymously. Each experience contains the content and layout that is most appropriate for each Segment.

Consider the following information when you create multiple experiences for the same Content Page:

- Every Content Page includes a *Default* experience. When you create a new Experience, *Default* is used as a template.
- You can modify the *Default* experience, but existing experiences based on *Default* don't change.
- You can duplicate any experience except *Default*.
- You can reorder Experiences in the selection dialog using the Up (![Up](../../../images/icon-angle-up.png)) and Down (![Down](../../../images/icon-angle-down.png)) controls.
- When you have multiple experiences in the same Content Page, their order determines their preference:
  
  - Experiences at the top of the list take preference over the ones below.
  - When a user meets the criteria for more than one Experience, the Experience listed first is the active one.
  - An experience is inactive when placed below an experience targeted to the *Anyone* Segment.
  - New Experiences are listed below the *Default* experience and inactive by default.

  ```tip::
     When multiple Experiences target the same Segment, Liferay DXP shows the active one next to the Experience's name.
  ```

To better understand how the Experiences' preference works, consider this example of a Content Page with four custom Experiences:

- *Anonymous User* and *Anonymous User Promotions*, which apply to the non-authenticated user Segment.
- *Authenticated User*: Applies to the *Authenticated User* Segment.
- *No Customization*: Applies to the *Anyone* Segment.

  ![The order of the experiences in the user interface determines their preference.](./content-page-personalization/images/06.png)

In this example:

- A non-authenticated user sees the Experience *Anonymous User* (the one with the _Active_ label). This users doesn't see the *Anonymous User Promotions* Experience because it's listed below *Anonymous User*.
- Authenticated users don't see the *Authenticated user* Experience, because the *No customization* Experience applies to the *Anyone* Segment and it's listed first.
- Anyone not in the *Anonymous User* or *Authenticated User* Segments sees the *Default* Experience.

## Creating a New Content Page Experience

1. Go to *Site Administration* &rarr; *Site Builder* &rarr; *Pages*.
2. Click the Actions (![Actions](../../../images/icon-actions.png)) menu and select *Edit*, or [create a new Content Page](../../creating-pages/building-and-managing-content-pages/building-content-pages.md).
3. At the top of the page, for the *Experience* click on *Default* to open the Experience selection dialog.

    ![Click on the current experience to create a new one or select a different existing experience.](./content-page-personalization/images/01.png)

4. Click on *New Experience*.
5. Enter a name for the Experience and select the Segment for the audience you want to target, or [create a *New Segment*](../segmentation/creating-and-managing-user-segments.md) (available in Liferay DXP 7.2 Fix Pack 1+ and Liferay Portal 7.2 CE GA2+.)

    ![Select an existing Segment for the Experience or create a new Segment.](./content-page-personalization/images/02.png)

6. Edit your Content Page with the information and layout you want to show to the selected Segment.
7. Using the Up (![Up](../../../images/icon-angle-up.png)) and Down (![Down](../../../images/icon-angle-down.png)) controls, move the experience in the list to set its preference (see [Understanding How Experiences Work](#understanding-how-experiences-work) for more information).
8. Click *Publish*.

The *Default* version of the page appears for everyone except for members of the selected Segment, who are presented with a version of the site for their defined Segment.

## Managing Content Page Experiences

When you edit a Content Page, you can click on the *Experience* to manage the options for that page.

![You can add, edit, delete, or change priority for Experiences.](./content-page-personalization/images/04.png)

1. Go to *Site Administration* &rarr; *Site Builder* &rarr; *Pages*.
2. Click the Actions (![Actions](../../../images/icon-actions.png)) menu and select *Edit*.
3. Click on the Experience you want to manage. From here you can:

   - Set the Experience Priority, using the Up (![Up](../../../images/icon-angle-up.png)) and Down (![Down](../../../images/icon-angle-down.png)) controls.
   - Edit (![Edit](../../../images/icon-edit.png)) the Experience's name or the selected Segment.
   - Duplicate (![Duplicate](../../../images/icon-copy.png)) the Experience.
   - Delete (![Delete](../../../images/icon-delete.png)) the Experience.

## Content Page Experiences and A/B Testing

When you [create an A/B Test](../ab-testing/creating-ab-tests.md) in Liferay DXP, you choose an Experience for the test. This Experience can be the Default one, or any other you have created.

To avoid changes in the Experience that can interfere with the A/B Test results, you cannot edit an Experience that is part of a running A/B Test.

![You cannot edit Experiences that are part of a running A/B Test](./content-page-personalization/images/05.png)

For more information about A/B Testing in Liferay DXP and Liferay Analytics, see [A/B Testing](../ab-testing/ab-testing.md).

## Related Information

* [Personalizing Collections](./personalizing-collection.md)
* [Getting Analytics for User Segments](../segmentation/getting-analytics-for-user-segments.md)
* [Creating and Managing User Segments](../segmentation/creating-and-managing-user-segments.md)
