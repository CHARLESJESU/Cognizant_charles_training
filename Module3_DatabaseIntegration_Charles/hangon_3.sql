select s.student_id, concat(s.first_name,' ',s.last_name) as fullname, count(e.enrollment_id) as `count`,avg_data.enrollementcount  from students s
 join enrollments e on e.student_id=s.student_id
 cross join (
select avg(enrollmentcount) as enrollementcount from (
select count(*) as enrollmentcount from enrollments group by student_id
) as per_count_students) as avg_data
group by s.student_id,avg_data.enrollementcount having count(e.enrollment_id)> avg_data.enrollementcount;

select *from courses c join enrollments e on c.course_id=e.course_id;