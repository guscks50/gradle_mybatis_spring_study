SELECT * FROM user_tables;

SELECT STUD_ID AS studId,NAME,EMAIL,PHONE,DOB FROM STUDENTS;

SELECT STUD_ID, NAME, EMAIL, DOB,
	substr(phone, 1, 3) as f,
	substr(phone, 5, 3) as m,
	substr(phone, 9, 4) as l
from students where stud_id= 1;

DELETE FROM STUDENTS WHERE STUD_ID = 3;

SELECT STUD_ID, NAME, EMAIL, PHONE, DOB, A.ADDR_ID, STREET, CITY, STATE, ZIP, COUNTRY
FROM STUDENTS S JOIN ADDRESSES A ON S.ADDR_ID=A.ADDR_ID
WHERE STUD_ID= 1;

select t.tutor_id, t.name as tutor_name, email, c.course_id, c.name, description, start_date, end_date
from tutors t left outer join courses c on t.tutor_id=c.tutor_id
where t.tutor_id=1;

SELECT * FROM students;
DELETE FROM STUDENTS ;
DROP TABLE STUDENTS ;

SELECT * FROM USER_PICS up 
;

SELECT course_id,NAME ,DESCRIPTION ,START_DATE ,END_DATE ,TUTOR_ID FROM COURSES; 

SELECT * FROM TUTORS ;
select t.tutor_id, t.name as tutor_name, email, c.course_id,
		c.name, description, start_date, end_date
		from tutors t left outer join courses c on t.tutor_id=c.tutor_id
		where t.tutor_id=1;
		
	SELECT * FROM STUDENTS s ;
	DELETE FROM STUDENTS s WHERE STUD_ID = 3;
	
SELECT * FROM TUTORS ;

INSERT INTO TUTORS (TUTOR_ID ,NAME ,EMAIL ,PHONE ,ADDR_ID) VALUES (5,'disu','johf@gmail.com','010-245-5484',)

SELECT * FROM COURSES c ;