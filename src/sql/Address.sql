-- address
-- address_seq(DECIMAL, PK),
-- zipcode
-- province 경기도
-- city 서울시
-- gugun 강남구, 가평군
-- doro 백범로 15번길
DROP TABLE address;
CREATE SEQUENCE address_seq START WITH 2000;
CREATE TABLE address(
	address_seq DECIMAL PRIMARY KEY,
	zipcode VARCHAR2(20),
	province VARCHAR2(20),
	city VARCHAR2(20),
	gugun VARCHAR2(20),
	doro VARCHAR2(20)
);

select * from address;

--1
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '04066', null, '서울시', '마포구', '와우산로 94'
);
--2
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '03674', null, '서울시', '서대문구', '거북골로 34'
);
--3
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '03722', null, '서울시', '서대문구', '연세로 50'
);
--4
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '15588', '경기도', '안산시', '상록구', '한양대학로 55'
);
--5
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '08826', null, '서울시', '관악구', '관악로 1' 
);
--6
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '13120', '경기도', '성남시', '수정구', '성남대로 1342'
);
--7
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '06974', null, '서울시', '동작구', '흑석로 84'
);
--8
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '46241', null, '부산광역시', '금정구', '부산대학로63'
);
--9
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '37224', '경상북도', '상주시', null, '경상대로 2559'
);
--10
INSERT INTO address(
	address_seq, zipcode, province, city, gugun, doro
) VALUES (
	address_seq.nextval, '31538', '충청남도', '아산시', null, '순천향로 22'
);
