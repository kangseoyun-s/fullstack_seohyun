-- 1. JOIN
-- 여러 테이블을 한 개의 테이블처럼 사용하는 것
-- 공통 컬럼 기준으로 연결
-- 등가 조인(=)    :  매칭되는 행 where  절 emp.deptno = dept.deptno
-- 비등가 조인(= X) :          sal between losal and hisal
-- 자체 조인: emp e1, emp e2
-- outer join: 매칭되지 않은 행 포함 left, right, full outer join

-- ERD: Enitiy(테이블), Relationship(관계), Diagram(표)
--      Enitiy(테이블), Relationship(관계), Attribute(속성)

-- #1. 등가 조인
select * from emp, dept
where emp.deptno = dept.deptno;

select *
from emp e, dept d
where e.deptno = d.deptno;

select *
from emp e, join dept d on (e.deptno = d.deptno);

select *
from emp e, join dept d using (deptno);

select *
from emp e, natural join dept d;

select empno, ename, d.deptno, dname
from emp e, dept d
where e.deptno = d.deptno;

select empno, ename, d.deptno, dname
from emp e, join dept d on (e.deptno = d.deptno);

select empno, ename, d.deptno, dname
from emp e, join dept d using (deptno);

select empno, ename, d.deptno, dname
from emp e, natural join dept d;

-- #2. 외부 조인(매칭 X)
select * from dept; -- deptno 10,20,30,40
select * from emp; -- deptno 10,20,30

-- 1. 조건 (+) 오라클에서만 -- 없는 데이터 null 보충 / (+) 안 붙은 테이블의 데이터 보장
select ename, dname
from emp e, dept d
where e.deptno = d.deptno(+); -- 14 emp 데이터 보장, dept에서 모자라는 데이터 null로 채움

select ename, dname
from emp e, dept d
where e.deptno(+) = d.deptno; -- 15 dept 데이터 보장, emp에서 모자라는 데이터 null로 채움

-- 2. LEFT JOIN, RIGHT JOIN(ANSI 조인)
select ename, dname
from emp e inner join dept d on(e.deptno = d.deptno); -- 내부 조인 겹치는 애들만

select ename, dname
from emp e right outer join dept d 
on(e.deptno = d.deptno); -- right 쪽 테이블 보장

select ename, dname
from dept d left outer join emp e 
on(e.deptno = d.deptno);

-- 3. OUTER JOIN (두 테이블에 있는 모든 데이터 결합)
select ename, dname
from emp e full outer join dept d
on e.deptno = d.deptno;

-- 비표준 =, (+)
-- 표준 natural join, join on, join using, left join, right join, full join

--1
select * from emp, dept
order by empno;

select * from emp, dept 
where emp.deptno = dept.deptno
order by empno;

select *
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select empno, ename, deptno, dname, loc 
from emp e, dept d 
where e.deptno = d.deptno;
-- deptno의 필드가 누구 테이블인지 확인 불가능

select e.empno, e.ename, d.deptno, d.dname, d.loc 
from emp e, dept d 
where e.deptno = d.deptno 
order by d.deptno, e.empno;

select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc
from emp e, dept d 
where e.deptno = d.deptno and e.sal >= 3000;

select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc
from emp e
join dept d on e.deptno = d.deptno
where e.sal >= 3000;

select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc
from emp e 
join dept d using deptno
where e.sal >= 3000;

select empno, ename, sal, deptno, dname, loc
from emp e
natural join dept d
where e.sal >= 3000;

select * from salgrade;
select *
from emp, salgrade
where sal between losal and hisal;
 
select *
from emp e join salgrade s
on(e.sal >= losal and e.sal <= hisal);

select *
from emp e join salgrade s
using(e.sal >= losal and e.sal <= hisal);
-- x

select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1, emp e2
where e1.mgr = e2.empno
order by e1.mgr asc;

select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 join emp e2
on e1.mgr = e2.empno
order by e1.mgr asc;

select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 join emp e2
using (e1.mgr = e2.empno)
order by e1.mgr asc;
-- X

select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 natural join emp e2
e1.mgr = e2.empno
order by e1.mgr asc;
-- X

--9
select e1.empno, e1.ename, e1.mgr,
e2.empno as mgr_empno, e2.ename as mgr_ename
from emp e1, emp e2
where e1.mgr = e2.empno(+)
order by e1.empno;

--10.
select e1.empno, e1.ename, e1.mgr,
e2.empno as mgr_empno, e2.ename as mgr_ename
from emp e1, emp e2
where e1.mgr(+) = e2.empno
order by e1.empno;
-- (+)가 붙지 않은 쪽의 데이터만 보장함

-- 11.
select e.EMPNO, e.ENAME, e.JOB, e.MGR, e.HIREDATE, e.SAL, e.COMM, deptno, d.dname, d.loc
from emp e natural join dept d
order by deptno, e.EMPNO;

-- 12.
select e.EMPNO, e.ENAME, e.JOB, e.MGR, e.HIREDATE, e.SAL, e.COMM, deptno, d.dname, d.loc
from emp e join dept d using(deptno)
where e.SAL>=3000
order by e.EMPNO, deptno;

-- 13.
select e.EMPNO, e.ENAME, e.JOB, e.MGR, e.HIREDATE, e.SAL, e.COMM, e.deptno, d.dname, d.loc
from emp e join dept d on (e.deptno = d.deptno)
where sal <=3000
order by e.deptno, empno;

-- 14.
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 left outer join emp e2
on (e1.mgr = e2.empno)
order by e1.empno;

-- 15.
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 right outer join emp e2
on (e1.mgr = e2.empno)
order by e1.empno, mgr_empno;

-- 16.
select e1.empno, e1.ename, e1.mgr, e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 full outer join emp e2
on (e1.mgr = e2.empno)
order by e1.empno;

-- ex001
select d.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno and e.sal >2000
order by dname, ename desc;
-- sql-99 이전
select d.deptno, d.dname, e.empno, e.ename, e.sal
from emp e join dept d
on(e.deptno = d.deptno and e.sal > 2000)
order by dname, ename desc;
-- sql-99

-- ex002
select d.deptno, d.dname,
trunc(avg(sal)) as avg_sal, 
max(sal) as max_sal,
min(sal) as min_sal,
count(*) cnt
from emp e, dept d
where e.deptno = d.deptno
group by d.deptno, d.dname;
-- 이전
select d.deptno, d.dname,
trunc(avg(sal)) as avg_sal, 
max(sal) as max_sal,
min(sal) as min_sal,
count(*) cnt
from emp e join dept d
on (e.deptno = d.deptno)
group by d.deptno, d.dname;

-- ex003
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from emp e, dept d
where e.deptno(+) = d.deptno
order by d.deptno, d.dname, e.ename;
-- 이전
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from emp e join dept d
on (e.deptno(+) = d.deptno)
order by d.deptno, d.dname, e.ename;
-- 99

-- ex004
select d.deptno, d.dname, e.empno, e.ename, e.mgr, e.sal,
d.deptno as deptno_1, s.losal, s.hisal, s.grade, m.empno as mgr_empno, m.ename as mgr_ename
from emp e, dept d, salgrade s, emp m
where e.deptno = d.deptno(+) and e.sal between s.losal(+) and s.hisal(+) and e.mgr = m.empno(+)
order by d.deptno, d.dname, e.ename;
-- 이전
select d.deptno, d.dname, e.empno, e.ename, e.mgr, e.sal,
d.deptno as deptno_1, s.losal, s.hisal, s.grade, m.empno as mgr_empno, m.ename as mgr_ename
from emp e left join dept d
on e.deptno = d.deptno
left join salgrade s 
on e.sal between s.losal and s.hisal
left join emp m
on e.mgr = m.empno
order by d.deptno, d.dname, e.ename;