create table post(
            ID                NUMBER NOT NULL PRIMARY KEY,
			APP_USER_ID       NUMBER NOT NULL,
			TITLE             VARCHAR2(200) NOT NULL,
			CONTENT           CLOB NOT NULL,
			PASS              VARCHAR2(100) NOT NULL,
			CREATED_AT        DATE default sysdate,
			HIT               NUMBER default 0
);

create sequence post_seq;

select * from post;
select * from appuser;

commit;

insert into post (id, app_user_id, title, content, pass) 
values (post_seq.nextval, ?, ?, ?, ?);

insert into post (id, app_user_id, title, content, pass) 
values (post_seq.nextval, 1 , 'title', 'content', '1111');

SELECT      p.* ,  u.email  email
FROM      post p  join appuser u   on  p.app_user_id= u.app_user_id;

update post set hit=hit+1 where id=5;
select * from post where id=5;

SELECT p.*, u.email email
FROM post p LEFT JOIN appuser u ON p.app_user_id = u.app_user_id;

--update post set title=?, content=? where id=? and pass=?
update post set title='new-title', content='new-content' where id=1 and pass='1111';

-- delete from post where id=? and pass=?
delete from post where id=5 and pass='1111'

ALTER TABLE POST MODIFY TITLE NULL;

desc post;


ALTER TABLE post MODIFY title VARCHAR2(200);




