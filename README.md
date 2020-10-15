<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://docs.simplicite.io//logos/logo250.png)
* * *

`Html2Pdf` module definition
============================

Test HTML -> PDF functions

`H2fWkhtml2pdf` business object definition
------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      | 
| ------------------------------------------------------------ | ---------------------------------------- | -------- | --------- | -------- | -------------------------------------------------------------------------------- |
| `h2pWkUrl`                                                   | url(100)                                 | yes*     | yes       |          | -                                                                                |
| `h2pWkHtml`                                                  | text(10000)                              | yes      | yes       |          | -                                                                                |
| `h2pWkFile`                                                  | document                                 |          |           |          | -                                                                                |

### Custom actions

* `h2f-makePdf`: 

