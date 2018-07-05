--userid, password, name, ssn, regidate, addr_seq, phone, email, profile, access_num, credit_rating, account_seq
drop table member;

create table Member(
	userid VARCHAR2(20) CONSTRAINT member_pk_userid PRIMARY KEY,
	password VARCHAR2(20),
	name VARCHAR2(20),
	ssn VARCHAR2(8),
	regidate DATE,
	phone VARCHAR2(13),
	email VARCHAR2(20),
	profile VARCHAR2(8),
	access_num VARCHAR2(8),
	credit_rating DECIMAL,
	address_seq DECIMAL,
	account_seq DECIMAL
);

--userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
ALTER TABLE member ADD CONSTRAINT address_fk_address_seq FOREIGN KEY (address_seq) REFERENCES address(address_seq);
ALTER TABLE member ADD CONSTRAINT account_fk_account_seq FOREIGN KEY (account_seq) REFERENCES account(account_seq);
--1
INSERT INTO member( 
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'LSSin', 'tnstls', '이순신', '910927-1', SYSDATE, '010-1212-3434', 'lee9109@test.com', 'lee.jpg', '', 5, 2020, 1000
);
--2
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'HKDong', 'rlfehd', '홍길동', '871028-1', SYSDATE, '010-4545-2121', 'hong8710@test.com', 'hong.jpg', '', 5, 2021, 1001
);
--3
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'KYShin', 'dbtls', '김유신', '940124-1', SYSDATE, '010-7878-5454', 'kim9401@test.com', 'kim.jpg', '', 5, 2022, 1002
);
--4
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'LHSuck', 'gmltjr', '유희석', '930413-1', SYSDATE, '010-4541-7958', 'lyu9304@test.com', 'lyu.jpg', '', 5, 2023, 1003
);
--5
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'KDHye', 'ekgp', '김다혜', '930519-2', SYSDATE, '010-9451-4571', 'kim9305@test.com', 'kdh.jpg', '', 5, 2024, 1004
);
--6
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'CJHyun', 'wlgus', '최지현', '950412-2', SYSDATE, '010-6584-1321', 'choe9504@test.com', 'chjh.jpg', '', 5, 2025, 1005
);
--7
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'Samsong', 'tkathd', '샘송', '890357-2', SYSDATE, '010-3357-4621', 'ssong8903@test.com', 'ssg.jpg', '', 5, 2026, 1006
);
--8
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'Lgee', 'dpfwl', '에르지', '921017-1', SYSDATE, '010-3241-0874', 'lgee@test.com', 'lgee.jpg', '', 5, 2027, 1007
);
--9
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'Moonstar', 'ansquf', '문별', '940215-2', SYSDATE, '010-5975-1457', 'mstar9402@test.com', 'sta.jpg', '', 5, 2028, 1008
);
--10
INSERT INTO member (
	userid, password, name, ssn, regidate, phone, email, profile, access_num, credit_rating, address_seq, account_seq
) VALUES(
	'Blingling', 'fldfld', '블링링', '881231-2', SYSDATE, '010-6655-8421', 'blling@test.com', 'lin.jpg', '', 5, 2029, 1009
);
select * from member;

-- 조인 JOIN
SELECT userid, name, phone, account_num, province, city
FROM member m, account ac, address ad
WHERE m.account_seq = ac.account_seq
AND m.address_seq = ad.address_seq
; 
