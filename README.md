# GAEJ-WEBAPI-YASUI

Google App Engine for Java (+Objectify)で、WebAPIを作るテスト。

## 使い方

/yasui : 商品の最安値を表示する。datastoreに登録されている最安値情報を一覧で表示する。

/yasui/init : 商品の最安値情報を手動で入力する。サンプルデータには特に意味はないし最安値でもないし。たまに更新したりするかもしれないししないかもしれないし。

## 開発環境

ECLIPSE JEE PHOTON

Google Cloud Tools for Eclipse

jdk1.8.0_131

## TODO

Objectifyでデータを操作する部分がServletに書いてあるのはそのうち直します

JANコードを渡すと、最安値情報をJSON形式で返す部分はそのうち作ります

XAMARIN.FORMSでアクセスして中身を表示するアプリは別プロジェクトで作ります。

readmeはそのうちもっとマシにします。
