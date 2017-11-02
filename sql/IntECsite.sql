set names utf8;
set foreign_key_checks=0;


drop database if exists IntECsite;
create database IntECsite;
use IntECsite;

create table user_info(
id int not null primary key,/*ID*/
user_id varchar(16) not null unique,/*ユーザーID*/ /*unique*/
password varchar(16) not null,/*パスワード*/
first_name varchar(16) not null,/*名*/
family_name varchar(16) not null,/*姓*/
first_name_kana varchar(16) not null,/*名かな*/
family_name_kana varchar(16) not null,/*姓かな*/
sex tinyint default 0 not null,/*性別*/ /*0:男性 1:女性*/
email varchar(32) not null,/*メールアドレス*/
status tinyint default 0 not null, /*ステータス*/ /*0:無効 1:有効*/
logined tinyint default 0 not null, /*ログインフラグ*/ /*0:未ログイン 1:ログイン済*/
insert_date datetime not null,/*登録日*/
update_date datetime/*更新日*/
);


create table product_info(
id int primary key not null,/*ID*/
product_id int not null unique,/*商品ID*/
product_name varchar(100) not null unique,/*商品名*/
product_name_kana varchar(100) not null unique,/*商品名かな*/ /*unique*/
product_description varchar(255) not null,/*商品詳細*/ /*unique*/
category_id int not null,/*カテゴリID*/
foreign key(category_id) references m_category(category_id), /*m_category.category_idとfk*/
price int not null,/*価格*/
image_file_path varchar(100), /*画像ファイルパス*/
image_file_name varchar(50),/*画像ファイル名*/
release_date datetime not null,/*発売年月*/
release_company varchar(50),/*発売会社*/
status tinyint default 0 not null, /*ステータス*/ /*0:無効 1:有効*/
insert_date datetime not null,/*登録日*/
update_date datetime/*更新日*/
);


create table cart_info(
id int primary key not null,/*ID*/
user_id varchar(16) not null,/*ユーザーID*/
foreign key(user_id) references user_info(user_id), /*user_info.user_idとfk*/
product_id int not null,/*商品ID*/
foreign key(product_id) references product_info(product_id), /*product_info.product_idとfk*/
insert_date datetime not null,/*登録日*/
update_date datetime /*更新日*/
);


create table purchase_history_info(
id int primary key not null,/*ID*/
user_id varchar(16) not null, /*ユーザーID*/
foreign key(user_id) references user_info(user_id),/*user_info.user_idとfk*/
product_id int not null,/*商品ID*/
foreign key(product_id) references product_info(product_id),/*product_info.product_idとfk*/
insert_date datetime not null,/*登録日*/
update_date datetime /*更新日*/
);

create table destination_info(
id int primary key not null,/*ID*/
user_id varchar(16) not null unique,/*ユーザーID*/ /*unique*/
first_name varchar(16) not null,/*名*/
family_name varchar(16) not null,/*姓*/
first_name_kana varchar(16) not null,/*名かな*/
family_name_kana varchar(16) not null,/*姓かな*/
email varchar(32) not null,/*メールアドレス*/
tel_number varchar(13) not null,/*電話番号*/
user_address varchar(50) not null,/*住所*/
insert_date datetime not null,/*登録日*/
update_date datetime/*更新日*/
);

create table m_category(
id int primary key not null,/*ID*/
category_id int not null unique,/*カテゴリID*/ /*unique*/
caregory_name varchar(20) not null unique,/*カテゴリ名*/ /*unique*/
category_description varchar(100),/*カテゴリ詳細*/
insert_date datetime not null,/*登録日*/
update_date datetime/*更新日*/
);

/*INSERT*/
/*(番号、番号、商品名、商品かな、商品説明、カテゴリID、販売月、販売企業、画像URL、値段、状態、登録日)*/

INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,release_date,release_company,image_file_path,price,status,insert_date)VALUE
(1,1,"スタンダードセット","すたんだーどせっと","スタンダードで使えるカードです。","1","2013/3/11","Blizzard","./images/standard.jpg",100,"1","YYYY,MM,DD,hh,mm,ss,n*"),
(2,2,"凍てつく王座の騎士団","いてつくおうざのきしだん","最新弾です","2","2017/8/11","Blizzard","./images/coldking.jpg",100,"1","YYYY,MM,DD,hh,mm,ss,n*"),
(3,3,"仁義なきガジェッツァン","じんぎなきがじぇっつぁん","","3","2016/12/1","Blizzard","./images/gaje.jpg",200,"1","YYYY,MM,DD,hh,mm,ss,n*"),
(4,4,"グランドトーナメント","ぐらんどとーなめんと","","4","2015/8/24","Blizzard","./images/grand.jpg",200,"1","YYYY,MM,DD,hh,mm,ss,n*"),
(5,5,"ゴブリンvsノーム","ごぶりんぶいえすのーむ","","5","2014/12/8","Blizzard","./images/gobvsnorm.jpg",150,"1","YYYY,MM,DD,hh,mm,ss,n*"),
(6,6,"旧神のささやき","きゅうしんのささやき","","6","2016/4/28","Blizzard","./images/oldgods.jpg",150,"1","YYYY,MM,DD,hh,mm,ss,n*"),
(7,7,"ノートBook","のーとぶっく","ノートブックです","7","2000/3/3","Blizzard","./images/notebook.jpg",120,"1","YYYY,MM,DD,hh,mm,ss,n*");
