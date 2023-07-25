Subtraction of 2 16 bit numbers

lhld 4400h
xchg
lhld 4402h
mov a,l
sub e
mov l,a
mov a,h
sbb d
mov h,a
mvi b,00h
jnc loop
inr b
loop: shld 4405h
mov a,c
sta 4407h
hlt


Addition of 2 16 bit numbers without using DAD 

lhld 4400h
xchg
lhld 4402h
mov a,l
add e
mov l,a
mov a,h
adc d
mov h,a
mvi b,00h
jnc loop
inr b
loop: shld 4405h
mov a,c
sta 4407h
hlt


Addition of 2 16 bit numbers using dad

lhld 4400h
xchg
lhld 4402h
dad d
mvi b,00h
jnc loop
inr b
loop: shld 4405h
mov a,c
sta 4407h
hlt






