-- 제약 조건
1. not null null 입력 금지
2. unique 중복 금지, null 허용
3. primary key 고유 식별자, 중복/null 금지
4. foreign key 다른 테이블 참조
5. check 조건 검사

-- rdb
-- 테이블 관계 속성
-- foreign key
-- 1. 다른 테이블 참조
-- 2. 부모 테이블의 값만 입력 가능
-- 3. 참조 무결성 유지

-- 부서는 많은 사원(emp_fk)을 가진다
-- 부서 테이블(depn_fk)이 먼저 존재

create table dept_fk(
deptno number      primary key,
dname varchar(50)
);

create table emp_fk(
empno number      primary key,
ename varchar(50) not null,
deptno number(2),
constraint fk_dept foreign key(deptno) references dept_fk(deptno) on delete cascade
                -- 내 테이블의 deptno              부모 테이블(deptno)
                
);

select table_name from user_tables;

-- 1. insert 부서 테이블 삽입
insert into dept_fk (deptno, dname) values (10, 'bug_hunter');
insert into dept_fk (deptno, dname) values (20, 'pawject');
insert into dept_fk (deptno, dname) values (30, 'test');

-- 2. 사원 테이블 삽입
insert into emp_fk (empno, ename, deptno) values (1, 'first', 30);
insert into emp_fk (empno, ename, deptno) values (1, 'second', 40);
insert into emp_fk (empno, ename, deptno) values (1, 'third', 50);

-- 2. on delete casecade
delete from dept_fk where deptno=30; -- 부모 삭제
select * from emp_fk;  -- 자식 자동 삭제

-- Q1. jsp + oracle 외래키
-- 1. 구조 파악
desc appuser;
이름           널?       유형            
------------ -------- ------------- 
APP_USER_ID  NOT NULL NUMBER        
EMAIL        NOT NULL VARCHAR2(100) 
PASSWORD     NOT NULL VARCHAR2(255) 
MBTI_TYPE_ID          NUMBER        
CREATED_AT            DATE    

desc post;
이름          널?       유형            
----------- -------- ------------- 
ID          NOT NULL NUMBER        
APP_USER_ID NOT NULL NUMBER        
TITLE                VARCHAR2(200) 
CONTENT     NOT NULL CLOB          
PASS        NOT NULL VARCHAR2(100) 
CREATED_AT           DATE          
HIT                  NUMBER

-- 2. 부모와 자식 테이블 관계
-- 유저는 많은 글을 가질 수 있다.

alter table post add constraint fk_post_appuser foreign key(app_user_id) references appuser(app_user_id);

select app_user_id from post where app_user_id not in(select app_user_id from appuser);

select constraint_name, table_name, column_name
from user_cons_columns
where table_name='POST';

delete from appuser;
delete from post;
commit;
