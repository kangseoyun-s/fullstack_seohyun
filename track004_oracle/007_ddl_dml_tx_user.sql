-- crud (create, read, update, delete)
-- 1 dml 조작어 insert(삽입) select(조회) update(수정) delete(지우기) → CRUD
-- 2. ddl 정의어 create(만들기) alter(수정) drop(삭제, 복구 불가능) → CAD
-- 3. dcl 제어어 grant(주세요) revoke(권한 빼기)
-- 4. tcl 제어어 commit(반영), rollback(되돌리기), savepoint(지점)

------------------------------------------------------------------------------
-- 1 dml 조작어 ● insert(삽입) select(조회) update(수정) delete(지우기)
-- 1. 테이블 복사
create table dept_temp as select * from dept;
desc dept_temp
select * from dept_temp;


-- 2. insert
insert into dept_temp(deptno, dname, loc) values (50, 'DATEBASE', 'SEOUL');
insert into dept_temp values (60, 'NWTEORK', 'BUSAN');
insert into dept_temp values (70, 'WEB', NULL);
insert into dept_temp(deptno, loc, dname) values (80, ' ', 'FRONT');
insert into dept_temp(loc, dname, deptno) values ('INCHEON', 'BACK',90);
insert into dept_temp(deptno, dname) values (99,'MOBLIE');

commit;

select * from dept_temp;

-- Q1.  EMP테이블을 복사해 EMP_TEMP 테이블을 만드시오. ( 구조확인, 전체데이터 확인)
-- Q2.  모든필드 명시하는 방법이용해서   다음의 값 넣기 - 9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10
-- Q3.  필드 명시 안하는 방법이용해서 다음의 값 넣기    - 1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, NULL, 20

create table emp_temp as select * from emp;
desc emp_temp
select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno ) 
values ( 9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);

insert into emp_temp values ( 1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, NULL, 20);

commit;
select * from emp_temp;

------------------------------------------------------------------------------
-- 1 dml 조작어 insert(삽입) select(조회) ●update(수정) ●delete(지우기)
select * from dept_temp;

-- 1. 업데이트
----------------------------------------
update 테이블명 set  바꿀 필드1 = 바꿀값1,
바꿀 필드2 = 바꿀 값2 ,,,,
where 조건;
----------------------------------------

-- 2. 전체 데이터 업데이트
update dept_temp set loc='INCHEON';
update dept_temp set loc='NEWYORK' where deptno=10;
update dept_temp set loc='DALLAS' where deptno =20 and dname='RESEARCH';

select * from dept_temp;

-- 3. delete
------------------------------
delete from 테이블명 where 조건
------------------------------
delete from dept_temp; -- 전체 데이터 삭제
delete from dept_temp where deptno=10;
delete from dept_temp where deptno>=30;
-- 3.
commit;

select * from dept_temp;
select * from dept;

insert into dept_temp (deptno, dname, loc)
select deptno, dname, loc from dept;

-- Q1. dept_temp 모든 데이터 삭제
-- Q2. insert 이용해서 데이터 삽입, 반영
-- Q3. dept_temp 테이블에서 40번 부서의 이름 DATABASE, 지역 SEOUL 수정
-- Q4. 데이터 되돌리기

delete from dept_temp;
insert into dept_temp (deptno, dname, loc)
select deptno, dname, loc from dept;
commit;
select * from dept_temp;
update dept_temp set loc='SEOUL', dname='DATABASE' where deptno =40 and dname='OPERATIONS';
rollback; -- 되돌리기


-- #0. 준비 -  다음 문제들을 풀으시오
-- Q1. DEPT 테이블을 복사해 DEPT_TCL테이블을 작성하시오.
-- Q2. DEPT_TCL 테이블에 다음과 같이 데이터를 입력, 수정, 삭제 하시오.
--    2-1.  데이터 삽입   50, 'DATABASE', 'SEOUL'
--    2-2.  부서번호가 40인  LOC를 INCHEON 으로 수정
--    2-3.  DNAMD이 RESEARCH 인데이터 삭제
--    2-4.  전체데이터 확인

create table dept_tcl as select * from dept;
desc dept_tcl
select * from dept_tcl;

insert into dept_tcl (deptno, dname, loc) values (50, 'DATABASE', 'SEOUL');
update dept_tcl set loc='INCHEON' where deptno=40;
delete from dept_tcl where dname='RESEARCH';
select * from dept_tcl;

-- 데이터 반영
commit;
-- 데이터 되돌리기
rollback;
insert into dept_tcl values (20, 'AI', 'INCHEON');
rollback;
select * from dept_tcl;

-- savepoint
insert into dept_tcl values (60, 'AI', 'INCHEON'); -- insert (작업 후 저장)
savepoint sp_insert; -- 기준점 설정

update dept_tcl set deptno=20 where deptno=60; -- update
savepoint sp_update; -- insert 확정, 이후 작업만 되돌리기(기준점2)

rollback to sp_insert;

-- 2. ddl 정의어 create(만들기) alter(수정) drop(삭제, 복구 불가능) → CAD

--1. create
create table 테이블명 
(필드명1 자료형 옵션, 
필드명2 자료형 옵션,
필드명3 자료형 옵션)

-------------------------
필드명 - 영문소문자
자료형 - 숫자는 number, 문자열 varchar2(갯수), 날짜 date
옵션 - not null 필수 입력, 기본값 primary key


create table dept_ddl(deptno number(2) primary key, 
dname varchar(50) not null, loc varchar2(50));
desc dept_ddl
select * from dept_ddl;

alter table 테이블명 add  필드명 자료형
                    drop column 필드명
                    modify 필드명 자료형
                    
alter table dept_ddl add admin varchar(50);

alter table dept_ddl modify admin varchar(100) not null;

alter table dept_ddl drop column admin;
                    
drop table 테이블명

drop table dept_ddl;
rollback;
desc dept_ddl;

--✅ 문제 1: 다음과 같이 테이블을 작성하고 데이터를 삽입하세요 ※AppUser 의 FK는 무시하세요.
create table MbtiType (
mbti_type_id number primary key,
name varchar(10) not null,
description varchar(100));
insert into MbtiType values (3, 'ENFP', '열정적이고 창의적인 성향');
insert into MbtiType values (7, 'INTJ', '논리적이고 전략적인 성향');
create table AppUser (
app_user_id number primary key,
email varchar(100) not null unique,
password varchar(255) not null,
mbti_type_id number, 
created_at timestamp default current_timestamp);
insert into AppUser values (1, 'alice@example.com', 'hashed_pw_123', 3, to_timestamp('2025-10-01 10:00:00'));
insert into AppUser values (2, 'bob@example.com', 'hashed_pw_456', 7, to_timestamp('2025-10-02 14:30:00'));
--✅ 문제 1: AppUser 테이블에 사용자 이름(name) 컬럼을 추가하세요.
--컬럼 타입은 VARCHAR2(50)이며 NULL 허용
select * from AppUser;
select * from MbtiType;
ALTER TABLE AppUser ADD name VARCHAR2(50);
--✅ 문제 2: AppUser 테이블의 email 컬럼에 NOT NULL 제약을 추가하세요.
ALTER TABLE AppUser MODIFY email VARCHAR2(100) NOT NULL;
--✅ 문제 3: AppUser 테이블의 password 컬럼 길이를 255 → 100으로 줄이세요.
ALTER TABLE AppUser MODIFY password VARCHAR2(100) NOT NULL;
--✅ 문제 4: MbtiType 테이블에 컬럼 category를 추가하세요.
--타입은 VARCHAR2(20)이며 기본값은 '기본'
ALTER TABLE MbtiType ADD category VARCHAR2(20) DEFAULT '기본';
--✅ 문제 5: MbtiType 테이블의 description 컬럼 이름을 details로 변경하세요.
--https://www.oracletutorial.com/
alter table MbtiType rename column description to details;
--✅ 문제 6: AppUser 테이블의 name 컬럼을 삭제하세요.
ALTER TABLE AppUser DROP COLUMN name;
--✅ 문제 7:  MbtiType 테이블 이름을 MbtiInfo로 변경하세요.
ALTER TABLE MbtiType RENAME TO MbtiInfo;
select * from MbtiInfo;