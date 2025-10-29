-- 008_object

-- 1. 시퀀스: 자동 번호 생성기 ★
-- 2. 뷰 : 가상 테이블 (select 문 결과를 저장한 객체) ★
-- 3. 동의어: 객체에 대한 별칭
-- 4. 인덱스: 검색 성능 향상 ★
-- 5. 클러스터: 여러 테이블을 물리적으로 같은 공간에 저장

--------------------------------------------------------------------
-- 1. 시퀀스: 자동 번호 생성기 ★
--------------------------------------------------------------------
create sequence emp_seq; -- 시작 1, 증가 단위 1,  10^27
create sequence dept_seq;

create sequence emp_seq2
start with 1000 -- 시퀀스 시작 값
increment by 1 -- 몇 개씩 증가?
maxvalue 9999 -- 최대값 지정
nocache;  -- 메모리에 미리 몇 개 값 저장해 둘지

select emp_seq.NEXTVAL from dual;
select dept_seq.NEXTVAL from dual;

select table_name from user_tables;
desc dept_temp;

SELECT table_name, constraint_name, column_name
FROM user_cons_columns
WHERE constraint_name IN (
  SELECT constraint_name
  FROM user_constraints
  WHERE constraint_type = 'U'
);

insert into dept_temp values (dept_seq.NEXTVAL, 'ai', 'INCHEON');
select * from dept_temp;

-- Q appuser 테이블에서 시퀀스 만들기;
desc APP_USER;
create sequence appuser_seq;

alter table appuser modify email varchar2(100) not null unique; -- 유일한 값
drop table appuser;

CREATE TABLE appuser (
    APP_USER_ID   NUMBER        NOT NULL primary key,
    EMAIL         VARCHAR2(100) NOT NULL unique,
    PASSWORD      VARCHAR2(255) NOT NULL,
    MBTI_TYPE_ID  NUMBER,
    CREATED_AT    DATE
);
SELECT table_name FROM user_tables;



SELECT table_name, constraint_name, column_name
FROM user_cons_columns
WHERE constraint_name IN (
  SELECT constraint_name
  FROM user_constraints
  WHERE constraint_type = 'U'
);

select * from  appuser;

select column_name from user_id_columns where table_name='APP_USER' and column_name='EMAIL';

commit;