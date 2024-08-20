COMMENT!																				Darrian Sampson
																						  Assignment #3
																								CSC 384
																							   10/03/18 ! 



; In this program we set out to solve an expression 2(-a + b - 1) + c in the register EAX.
; We will define double word variables a (area code), b (first three phone # digits), and c (last four phone # digits).
; All operations will be done in eax and result will be in eax by the end of evaluation of said expression. 




.586
.model flat

.stack 4096

.data

a	DWORD  816
b	DWORD  248
d	DWORD  0981     ; I get a syntax error for using c or C as a variable and I couldn't figure that out. Decided to just substitute d for c if that's alright. 

.code
main PROC

	neg a			; change the value of a to a negative 
	mov eax, a		; move the now negative value of a to register eax
	add	eax,b		; add b to eax (-a + b)
	sub eax, 1		; subtract 1 from that result (-a + b) - 1 
	add eax, eax	; using add in place of mul, doubling the value of eax, -569 + -569
	add	eax, d		; finally adding c to get the end result of -157 base 10 or FFFFFF63 base 16 in register eax





	ret

main ENDP


END