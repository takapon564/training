N = gets.chomp.to_i
 
ls = []
N.times do
  ls << gets.chomp.to_i
end
 
puts ls.uniq.count

