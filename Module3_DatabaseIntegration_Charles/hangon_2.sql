-- task1
-- 18
update enrollments set grade='B' where student_id=5 and course_id=1;
SET SQL_SAFE_UPDATES = 1;
delete from enrollments where grade is null;