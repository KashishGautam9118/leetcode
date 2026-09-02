# Write your MySQL query statement below
SELECT sell_Date,
        COUNT(DISTINCT product)AS num_sold,
        GROUP_CONCAT(
            DISTINCT product
            ORDER BY Product
            SEPARATOR ','
        )AS products
FROM Activities
GROUP BY sell_Date
ORDER BY sell_date,product
