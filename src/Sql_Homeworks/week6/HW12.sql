--film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
SELECT count(*) from film
where length > (select avg(length) from film);

--film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
SELECT count(*) FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);


--film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
SELECT title,rental_rate,replacement_cost FROM film
WHERE (rental_rate,replacement_cost) = ANY
(SELECT MIN(rental_rate), MIN(replacement_cost) FROM film);

--payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
SELECT customer_id, COUNT(*) AS purchase_count FROM payment
GROUP BY customer_id
ORDER BY purchase_count DESC;