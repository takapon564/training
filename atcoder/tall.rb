N, T = gets.split
x = 0
(N.to_i).times{ x+=gets.to_i }
if T.to_i==x/N.to_i
    puts 'normal'
else 
  puts T.to_i > x/N.to_i ? 'tall' : 'short'
end