a=[]

4.times do 
  a.push(gets.chomp)
end

a.reverse.each do |i|
  puts i.reverse
end