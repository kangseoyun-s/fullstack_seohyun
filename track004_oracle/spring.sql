	CREATE SEQUENCE sboard1_seq; 
	CREATE TABLE sboard1 (
		id          NUMBER PRIMARY KEY,
		app_user_id   NUMBER NOT NULL ,
		btitle      VARCHAR2(1000)  NOT NULL,
		bcontent    CLOB   NOT NULL,
		bpass       VARCHAR2(255)   NOT NULL,
		bfile       VARCHAR2(255)  default  'no.png' ,
		bhit        NUMBER(10) default 0,
		bip         VARCHAR2(255)   NOT NULL,
		created_at   TIMESTAMP(6)    default sysdate
		-- create_at   DATE    default sysdate
		-- created_at TIMESTAMP(6) DEFAULT   SYSTIMESTAMP
	);
 
 create table userdao (
      APP_USER_ID                   NUMBER(5) NOT NULL ,
      EMAIL                        VARCHAR2(100) NOT NULL ,
      PASSWORD                     VARCHAR2(100),
      MBTI_TYPE_ID                 NUMBER(3),
      CREATED_AT                   DATE
 );
 CREATE SEQUENCE userdao_seq;
 
desc appuser;

insert into appuser (APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID)
values (appuser_seq.nextval, 'a@a', '1111',1);

select count(*) from appuser where email='a@a' and password='1111';
select * from appuser order by app_user_id desc;
select * from appuser where app_user_id=21;

update appuser set password='1234', MBTI_TYPE_ID=2 where APP_USER_ID=41 and password='1111';

delete from appuser where APP_USER_ID=41 and password='1234';