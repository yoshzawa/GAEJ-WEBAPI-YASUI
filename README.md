# GAEJ-WEBAPI-YASUI

Google App Engine for Java (+Objectify)で、WebAPIを作るテスト。

デプロイしました（http://h30jsonkadai.fivepro.xyz/）

## 使い方

/yasui : 商品の最安値を全件リスト表示する。datastoreに登録されている最安値情報を一覧で表示する。

/yasui/init : 商品の最安値情報を手動で入力する。サンプルデータには特に意味はないし最安値でもないし。たまに更新したりするかもしれないししないかもしれないし。

/yasui/getPrice : JANで指定されたJANコードの商品の最安値をJSON形式で表示する。指定されたJANコードの商品が登録されていない時は"RESULT"を"FAIL"にする。

## 開発環境

ECLIPSE JEE PHOTON

Google Cloud Tools for Eclipse

jdk1.8.0_131

## TODO

Objectifyでデータを操作する部分がServletに書いてあるのはそのうち直します

JANコードを渡すと、最安値情報をJSON形式で返す部分はそのうち作ります　→　できました

XAMARIN.FORMSでアクセスして中身を表示するアプリは別プロジェクトで作ります。

readmeはそのうちもっとマシにします。
