# Condicionales

is_authenticated = true
role = :admin

if role == :admin
    puts "Pantalla de admin"
elsif role == :superadmin
    puts "Pantalla de Superadmin"
else
    puts "Pantalla de login"
end