-- 코드를 입력하세요
SELECT U.USER_ID, U.NICKNAME, concat(U.CITY,' ',U.STREET_ADDRESS1,' ', U.STREET_ADDRESS2) as 전체주소, concat(substr(U.TLNO,1,3),'-',substr(U.TLNO,4,4),'-',substr(U.TLNO,8,4)) as 전화번호
from USED_GOODS_BOARD as B join USED_GOODS_USER as U
on B.WRITER_ID = U.USER_ID
group by B.WRITER_ID
having count(B.WRITER_ID) >= 3
order by U.USER_ID desc

