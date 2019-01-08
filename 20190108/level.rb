n=gets.to_i
m=((n.to_f/1000.to_f)*10).round
if n < 6000
  puts n < 100 ? '00' : (m.to_s.size == 1 ? '0' + m.to_s : m.round )
else
  puts n <= 70000 ? (n < 30000 ? (n/1000)+50 : ((n/1000)-30)/5+80)  : 89
end