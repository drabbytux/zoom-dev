create table animals (  
       name text,
       species text,
       birthdate date);

create table diet (
       species text,
       food text);  

create table taxonomy (
       name text,
       species text,
       genus text,
       family text,
       t_order text); 

create table ordernames (
       t_order text,
       name text);

       #
# Uncomment one of these QUERY variables at a time and use "Test Run" to run it.
# You'll see the results below.  Then try your own queries as well!
#
QUERY = "select max(name) from animals;"

# QUERY = "select * from animals limit 10;"

# QUERY = "select * from animals where species = 'orangutan' order by birthdate;"

# QUERY = "select name from animals where species = 'orangutan' order by birthdate desc;"

# QUERY = "select name, birthdate from animals order by name limit 10 offset 20;"

# QUERY = "select species, min(birthdate) from animals group by species;"

# QUERY = '''
# select name, count(*) as num from animals
# group by name
# order by num desc
# limit 5;
# '''

/*
Here are the new select clauses introduced in the previous video:

... limit count
Return just the first count rows of the result table.

... limit count offset skip
Return count rows starting after the first skip rows.

... order by columns
... order by columns desc
Sort the rows using the columns (one or more, separated by commas) as the sort key. Numerical columns will be sorted in numerical order; string columns in alphabetical order. With desc, the order is reversed (desc-ending order).

... group by columns
Change the behavior of aggregations such as max, count, and sum. With group by, the aggregation will return one row for each distinct value in columns.
*/



INSERT
insert into table ( column1, column2, ... ) values ( val1, val2, ... );

If the values are in the same order as the table's columns (starting with the first column), you don't have to specify the columns in the insert statement:

insert into table values ( val1, val2, ... );