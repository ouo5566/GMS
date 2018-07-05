--money, account_seq, account_type, account_num, create_date, limit
CREATE TABLE account(
	account_seq DECIMAL,
	money DECIMAL,
	account_num VARCHAR2(20),
	account_type VARCHAR2(20),
	create_date DATE,
	limit DECIMAL
);
ALTER TABLE account ADD CONSTRAINT account_pk_account_seq PRIMARY KEY (account_seq);

SELECT * FROM TAB;
--1
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES (
	account_seq.nextval, 0, '110-513-487', '일반통장', SYSDATE, 0
);
--2
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES (
	account_seq.nextval, 36900, '110-457-154', '일반통장', SYSDATE, 0
);
--3
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES(
	account_seq.nextval, 578000, '110-972-451', '일반통장', SYSDATE, 0
);
--4
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES (
	account_seq.nextval, 8700, '110-454-164', '일반통장', SYSDATE, 0
);
--5
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES(
	account_seq.nextval, 100000, '110-732-542', '일반통장', SYSDATE, 0
);
--6
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES(
	account_seq.nextval, 59400, '110-457-128', '일반통장', SYSDATE, 0
);
--7
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES (
	account_seq.nextval, 0, '110-547-165', '일반통장', SYSDATE, 0
);
--8
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES(
	account_seq.nextval, 0, '110-245-135', '일반통장', SYSDATE, 0
);
--9
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES (
	account_seq.nextval, 248100, '110-854-013', '일반통장', SYSDATE, 0
);
--10
INSERT INTO account(
	account_seq, money, account_num, account_type, create_date, limit
) VALUES(
	account_seq.nextval, 457100, '110-450-743', '일반통장', SYSDATE, 0
);

SELECT * FROM ACCOUNT;
