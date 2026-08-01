select r.contest_id, ROUND(COUNT(r.user_id)*100.0/(Select COUNT(*) from users),2) as percentage from Register r group by r.contest_id order by percentage DESC , r.contest_id ;
