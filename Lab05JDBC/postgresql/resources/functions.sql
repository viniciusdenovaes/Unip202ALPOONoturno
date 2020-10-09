
create or replace function get_livros_caros(p_price float)
	returns refcursor
	language plpgsql
as
$$
declare
	mycur refcursor;
begin
	open mycur for
		SELECT b.title, b.isbn, b.publisher_id, b.price
		  FROM books as b
		 WHERE b.price >= p_price;
	return mycur;
end
$$
