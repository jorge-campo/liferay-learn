# ワークフローメトリクスの使用

> サブスクリプション

*ワークフローメトリクス*により、特定のワークフローイベントを完了するために費やされた時間についての洞察が提供されます。 これを使用するには、ワークフロープロセスのイベントに期限を設定します。 これらの期限設定は、SLA（サービスレベルアグリーメント）と呼ばれます。 定義すると、ワークフローレポートによって、SLAへの準拠が測定されます。 これは、ワークフローの参加者とワークフロー項目を送信するユーザーの間の契約のようなものです。 *ワークフローレポート*には、各ワークフロー項目のSLAステータス（期限内または期限切れ）を含む、SLAが設定されたすべてのプロセスのデータが表示されます。

``` important::
   * * SLAが設定されたワークフローの編集：* SLAが定義されたワークフローを編集すると（ノードの削除、タスク名の編集など）、ワークフロー/SLAパイプラインに既にある項目のSLAが無効になる場合があります。

   * *アクティブなプロセスに対するSLAの作成または編集：*項目が既にワークフロープロセスにある場合にSLAの期間を編集したり、新しいSLAを定義すると、現在ワークフローにあるすべてのインスタンスが再計算されます。 完了したワークフローインスタンスは再計算されません。
```

## 前提条件

*ワークフローメトリクス*を使用するには、Elasticsearchを使用してDXPデータにインデックスを付ける必要があります。 詳細については、[Installing Elasticsearch](https://help.liferay.com/hc/en-us/articles/360028711132-Installing-Elasticsearch)の記事をご覧ください。

## SLAの追加

1.  *[Control Panel]* → *[Workflow]* → *[Metrics]*に移動します。

2.  プロセスのタイトルをクリックします。

3.  プロセスに対するSLAがない場合は、そのことを示す警告メッセージが表示されます。 警告メッセージの*[Add a new SLA]*リンクをクリックして、新しいSLAフォームに直接アクセスします。

    または、オプション（![Options](../../../images/icon-options.png)）メニューをクリックし、*[SLA Settings]*を選択します。

    ![メトリクスアプリケーションからワークフロー定義にSLAを追加します。](./using-workflow-metrics/images/01.png)

4.  SLA画面で、*追加*ボタン（![Add](../../../images/icon-add.png)）をクリックします。

5.  新しいSLAフォームで、SLAに名前と説明を付けます。

6.  次の3つを指定して、SLAの期間を定義します。

      - **Start**：Enters Task: Review
      - **Pause**：On Task: Update
      - **Stop**：Process Ends: Approved

7.  SLAの期間（つまり、期限）を定義します。 2つの時間ボックスの少なくとも1つに入力します。

      - **Days：** 1
      - **Hours：**00:00

    ![SLAの例](./using-workflow-metrics/images/03.png)

8.  *[保存]*をクリックします。

![図2：SLA画面からSLAを管理します。](./using-workflow-metrics/images/02.png)

### 有効な開始および停止イベント

ワークフロータスクは、SLAの開始または終了パラメーターとして使用できます。

項目がここで定義されたイベントに到達すると、SLAタイマーがカウントを開始します。 次の中から選択します。

| イベント                | 説明                                    |
| ------------------- | ------------------------------------- |
| Process Begins      | これは開始ノードに対応します。                       |
| Enters Task: Review | SLAクロックは、ユーザーがアセットのレビューを開始したときに開始します。 |
| Enters Task: Update | SLAクロックは、ユーザーがアセットを更新したときに開始します。      |
| Leaves Task: Review | SLAクロックは、ユーザーがレビュープロセスを停止したときに開始します。  |
| Leaves Task: Update | SLAクロックは、ユーザーがタスクを離れたときに開始します。        |

項目が定義されたSLA期間（期限）の前に停止イベントに到達した場合、その項目はSLAに従って*期限内*となります。 指定した時間内に停止イベントに到達できなかった場合、*期限切れ*となります。 SLAの停止イベントとして機能するタスクを定義する場合は、次のいずれかを選択します。

| イベント                   | 説明                                    |
| ---------------------- | ------------------------------------- |
| Enters Task: Review    | SLAクロックは、ユーザーがアセットのレビューを開始したときに停止します。 |
| Enters Task: Update    | SLAクロックは、ユーザーがアセットを更新したときに停止します。      |
| Leaves Task: Review    | SLAクロックは、ユーザーがレビュープロセスを離れたときに停止します。   |
| Leaves Task: Update    | SLAクロックは、ユーザーがタスクを離れると停止します。          |
| Process Ends: Approved | これは終了ノードに対応します。                       |

[Pause]フィールドは、ワークフローに時間のカウントを停止する必要があるイベントがある場合に表示されます。 Single Approverワークフローの場合、項目が更新タスクにあるときにSLAタイマーを一時停止することを選択できます。 SLAは、開始ノードと終了ノードの間にある任意のタスクで一時停止でき、SLAを一時停止する必要があるときにノードを設定することによって定義します。 *ワークフロー項目が指定されたノードにある間、SLAタイマーは一時停止されます* 。

### 期間

| 単位時間  | 説明                                                                                       |
| ----- | ---------------------------------------------------------------------------------------- |
| Days  | 日数は整数で入力します。 36時間などの場合は、*[Hours]*フィールドと組み合わせて使用します。この場合は、 1日と12時間と表現します。                 |
| Hours | 時間数と分数を入力します。 *[Hours]*ボックスの値は*23:59*を超えてはいけません。 期間が1日を超える場合は、*[Days]*フィールドと組み合わせて使用します。 |

## 追加情報

  - [Creating Tasks in the Workflow Designer](https://help.liferay.com/hc/articles/360028821932-Creating-Tasks-in-the-Workflow-Designer)
  - [Workflow Task Nodes](https://help.liferay.com/hc/articles/360028834732-Workflow-Task-Nodes)