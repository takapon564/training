require 'time'
sec = gets.chomp.to_i
puts (Time.parse("1/1") + sec - (sec.to_i / 86400) * 86400).strftime("%H:%M:%S")