import Data.List

fib :: Int -> Int
fib number = fib' 0 1 number
fib' atual_number before_number 0 = atual_number
fib' atual_number before_number number = fib' (atual_number+before_number) atual_number (number-1)

fatorial :: Int -> Int
fatorial 0 = 0 
fatorial 1 = 1
fatorial number = fatorial (number-1) * (number)

numbers_fibs :: Int -> [Int]
numbers_fibs n = take n (map fib [0..])

insert_into :: Int -> Int-> [Int] -> [Int] 
insert_into number position list = as ++ (number:bs)
                  where (as,bs) = splitAt position list


delete_Number :: Int -> [a] -> [a]
delete_Number _ []     = []
delete_Number i (a:as)
   | i == 0    = as
   | otherwise = a : delete_Number (i-1) as

sep_List :: [Int]->([Int],[Int])
sep_List = partition even


order_odd_pair n = odd_list n ++ pair_list n
odd_list [] = []
odd_list (a:b) = if a `mod` 2 == 1 then a:odd_list b else odd_list b
pair_list [] = []
pair_list (a:b) = if a `mod` 2 == 0 then a:pair_list b else pair_list b

    
inverted_words   :: (Char -> Bool) -> String -> [String]
inverted_words p s =  case dropWhile p s of
                      "" -> []
                      s' -> w : inverted_words p s''
                            where (w, s'') = break p s'

reverse_List  [] = []
reverse_List  xs = last xs : reverse_List (init xs)

main = do
  print("Primeira questao:")
  print("Letra (a):")
  print(fib 10)
  print("Letra (b):")
  print(fatorial 5)
  let list_numbers_fibs = numbers_fibs 10
  let list_any_less_one = delete_Number 4 list_numbers_fibs
  let list_w_one_more= insert_into 6 3 list_numbers_fibs
  let tuple_pair_odd = sep_List list_numbers_fibs
  let list =  inverted_words (=='\n') "Nao te amo mais.\n\
  \Estarei mentindo dizendo que\n\
  \Ainda te quero como sempre quis.\n\
  \Tenho certeza que\n\
  \Nada foi em vao.\n\
  \Sinto dentro de mim que\n\
  \Voce nao significa nada.\n\
  \Nao poderia dizer jamais que\n\
  \Alimento um grande amor.\n\
  \Sinto cada vez mais que\n\
  \Ja te esqueci!\n\
  \E jamais usarei a frase:\n\
  \EU TE AMO!\n\
  \Sinto, mas tenho que dizer a verdade\n\
  \E tarde demais...\n"

  let list_line =  inverted_words (==' ') "la vou eu"
  print("Letra (c):")
  print(list_numbers_fibs)
  print("Letra (d):")
  print(list_any_less_one)
  print("Letra (e):")
  print(list_w_one_more)
  print("Letra (f):")
  print(tuple_pair_odd)
  print("Letra (g):")
  print(order_odd_pair list_numbers_fibs)
  print("Segunda questao:")
  print(reverse_List list_line)
  print("Terceira questao:")
  print(reverse_List list)
 