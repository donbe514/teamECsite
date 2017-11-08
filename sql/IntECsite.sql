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
category_id set('1','2','3','4') not null,/*カテゴリID*/
foreign key(category_id) references m_category(category_id), /*m_category.category_idとfk*/
price int not null,/*価格*/
image_file_path varchar(100), /*画像ファイルパス*/
image_file_name varchar(50),/*画像ファイル名*/
release_date datetime not null,/*発売年月*/
release_company varchar(50),/*発売会社*/
status tinyint default 0 not null, /*ステータス*/ /*0:無効 1:有効*/
stock int not null,/*個数*/
insert_date datetime not null,/*登録日*/
update_date datetime/*更新日*/
);


create table cart_info(
id int primary key not null,/*ID*/
user_id varchar(16) not null,/*ユーザーID*/
product_id int not null,/*商品ID*/
foreign key(product_id) references product_info(product_id), /*product_info.product_idとfk*/
stock int not null,/*個数*/
insert_date datetime not null,/*登録日*/
update_date datetime /*更新日*/
);


create table purchase_history_info(
id int primary key not null,/*ID*/
user_id varchar(16) not null, /*ユーザーID*/
foreign key(user_id) references user_info(user_id),/*user_info.user_idとfk*/
product_id int not null,/*商品ID*/
foreign key(product_id) references product_info(product_id),/*product_info.product_idとfk*/
item_count int not null,/*購入数*/
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
category_id set('1','2','3','4')  not null unique,/*カテゴリID*/ /*unique*/
caregory_name varchar(20) not null unique,/*カテゴリ名*/ /*unique*/
category_description varchar(100),/*カテゴリ詳細*/
insert_date datetime not null,/*登録日*/
update_date datetime/*更新日*/
);

INSERT INTO m_category
VALUE(
1,1,'すべてのカテゴリ','すべてのカテゴリ','2017/11/06 17/29/11','2017/11/06 17/29/11'
),(
2,2,'本','本','2017/11/06 17/29/11','2017/11/06 17/29/11'
),(
3,3,'家電・パソコン','家電・パソコン','2017/11/06 17/29/11','2017/11/06 17/29/11'
),(
4,4,'おもちゃ・ゲーム','おもちゃ・ゲーム','2017/11/06 17/29/11','2017/11/06 17/29/11'
);

INSERT INTO user_info
VALUE(
	1,/*ID*/
	'taro',/*ユーザーID*/ /*unique*/
	'123',/*パスワード*/
	'太郎',/*名*/
	'田中',/*姓*/
	'たろう',/*名かな*/
	'たなか',/*姓かな*/
	0,/*性別*/ /*0:男性 1:女性*/
	'mail',/*メールアドレス*/
	0, /*ステータス*/ /*0:無効 1:有効*/
	0, /*ログインフラグ*/ /*0:未ログイン 1:ログイン済*/
	'2017/11/06 17/29/11',/*登録日*/
	'2017/11/06 17/29/11'/*更新日*/
),
(
	2,/*ID*/
	'jiro',/*ユーザーID*/ /*unique*/
	'456',/*パスワード*/
	'次郎',/*名*/
	'田中',/*姓*/
	'じろう',/*名かな*/
	'たなか',/*姓かな*/
	0,/*性別*/ /*0:男性 1:女性*/
	'mail',/*メールアドレス*/
	0, /*ステータス*/ /*0:無効 1:有効*/
	0, /*ログインフラグ*/ /*0:未ログイン 1:ログイン済*/
	'2017/11/06 17/29/11',/*登録日*/
	'2017/11/06 17/29/11'/*更新日*/
),
(
	3,/*ID*/
	'hanako',/*ユーザーID*/ /*unique*/
	'789',/*パスワード*/
	'花子',/*名*/
	'田中',/*姓*/
	'はなこ',/*名かな*/
	'たなか',/*姓かな*/
	1,/*性別*/ /*0:男性 1:女性*/
	'mail',/*メールアドレス*/
	0, /*ステータス*/ /*0:無効 1:有効*/
	0, /*ログインフラグ*/ /*0:未ログイン 1:ログイン済*/
	'2017/11/06 17/29/11',/*登録日*/
	'2017/11/06 17/29/11'/*更新日*/
);

INSERT INTO product_info
VALUE(
    1,/*ID*/
    1,/*商品ID*/
    '本1',/*商品名*/
    'ほんいち',/*商品名かな*/ /*unique*/
    'ほんひとつめ',/*商品詳細*/ /*unique*/
    '1,2',/*カテゴリID*/
    100,/*価格*/
    'book1/path', /*画像ファイルパス*/
    'book1',/*画像ファイル名*/
    '2017/11/06 17/29/11',/*発売年月*/
    '会社A',/*発売会社*/
    0, /*ステータス*/ /*0:無効 1:有効*/
    50,/*個数*/
    '2017/11/06 17/29/11',/*登録日*/
    '2017/11/06 17/29/11'/*更新日*/
),(
    2,/*ID*/
    2,/*商品ID*/
    '家電1',/*商品名*/
    'かでんいち',/*商品名かな*/ /*unique*/
    'かでんひとつめ',/*商品詳細*/ /*unique*/
    '1,3',/*カテゴリID*/
    200,/*価格*/
    'kaden1/path', /*画像ファイルパス*/
    'kaden1',/*画像ファイル名*/
    '2017/11/06 17/29/11',/*発売年月*/
    '会社B',/*発売会社*/
    0, /*ステータス*/ /*0:無効 1:有効*/
    50,/*個数*/
    '2017/11/06 17/29/11',/*登録日*/
    '2017/11/06 17/29/11'/*更新日*/
),(
    3,/*ID*/
    3,/*商品ID*/
    'ゲーム1',/*商品名*/
    'げえむいち',/*商品名かな*/ /*unique*/
    'ゲームひとつめ',/*商品詳細*/ /*unique*/
    '1,4',/*カテゴリID*/
    300,/*価格*/
    'game1/path', /*画像ファイルパス*/
    'game1',/*画像ファイル名*/
    '2017/11/06 17/29/11',/*発売年月*/
    '会社A',/*発売会社*/
    0, /*ステータス*/ /*0:無効 1:有効*/
    50,/*個数*/
    '2017/11/06 17/29/11',/*登録日*/
    '2017/11/06 17/29/11'/*更新日*/
),(
    4,/*ID*/
    4,/*商品ID*/
    '本2',/*商品名*/
    'ほんに',/*商品名かな*/ /*unique*/
    '本ふたつめ',/*商品詳細*/ /*unique*/
    '1,2',/*カテゴリID*/
    400,/*価格*/
    'book2/path', /*画像ファイルパス*/
    'book2',/*画像ファイル名*/
    '2017/11/06 17/29/11',/*発売年月*/
    '会社C',/*発売会社*/
    0, /*ステータス*/ /*0:無効 1:有効*/
    50,/*個数*/
    '2017/11/06 17/29/11',/*登録日*/
    '2017/11/06 17/29/11'/*更新日*/
),(
    5,/*ID*/
    5,/*商品ID*/
    '家電2',/*商品名*/
    'かでんに',/*商品名かな*/ /*unique*/
    '家電ふたつめ',/*商品詳細*/ /*unique*/
    '1,3',/*カテゴリID*/
    500,/*価格*/
    'kaden2/path', /*画像ファイルパス*/
    'kaden2',/*画像ファイル名*/
    '2017/11/06 17/29/11',/*発売年月*/
    '会社A',/*発売会社*/
    0, /*ステータス*/ /*0:無効 1:有効*/
    50,/*個数*/
    '2017/11/06 17/29/11',/*登録日*/
    '2017/11/06 17/29/11'/*更新日*/
),(
    6,/*ID*/
    6,/*商品ID*/
    'ゲーム2',/*商品名*/
    'げえむに',/*商品名かな*/ /*unique*/
    'ゲームふたつめ',/*商品詳細*/ /*unique*/
    '1,4',/*カテゴリID*/
    600,/*価格*/
    'game2/path', /*画像ファイルパス*/
    'game2',/*画像ファイル名*/
    '2017/11/06 17/29/11',/*発売年月*/
    '会社C',/*発売会社*/
    0, /*ステータス*/ /*0:無効 1:有効*/
    50,/*個数*/
    '2017/11/06 17/29/11',/*登録日*/
    '2017/11/06 17/29/11'/*更新日*/
);

INSERT INTO destination_info
VALUE(
	1,/*ID*/
	'taro',/*ユーザーID*/ /*unique*/
	'太郎',/*名*/
	'田中',/*姓*/
	'たろう',/*名かな*/
	'たなか',/*姓かな*/
	'adress1',/*メールアドレス*/
	'123456789',/*電話番号*/
	'日本1',/*住所*/
	'2017/11/06 17/29/11',/*登録日*/
	'2017/11/06 17/29/11'/*更新日*/
),(
	2,/*ID*/
	'jiro',/*ユーザーID*/ /*unique*/
	'次郎',/*名*/
	'田中',/*姓*/
	'じろう',/*名かな*/
	'たなか',/*姓かな*/
	'adress2',/*メールアドレス*/
	'234567890',/*電話番号*/
	'日本2',/*住所*/
	'2017/11/06 17/29/11',/*登録日*/
	'2017/11/06 17/29/11'/*更新日*/
),(
	3,/*ID*/
	'hanako',/*ユーザーID*/ /*unique*/
	'花子',/*名*/
	'田中',/*姓*/
	'はなこ',/*名かな*/
	'たなか',/*姓かな*/
	'adress3',/*メールアドレス*/
	'345678901',/*電話番号*/
	'日本3',/*住所*/
	'2017/11/06 17/29/11',/*登録日*/
	'2017/11/06 17/29/11'/*更新日*/
);