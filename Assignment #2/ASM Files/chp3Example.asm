COMMENT!								Darrian Sampson 
												CSC 384
										  Assignment #2 
										       09/19/18 !




.586
.model flat

.stack 4096

.data
number DWORD -105
sum	   DWORD  ?


.code
main PROC

	mov eax, number			; move the value of variable number(-105) to register eax
	add eax, 158			; add the immediate value of 158 to register eax(current val: -105)
	mov sum, eax			; finally move the value of the sum of two numbers from register eax to sum variable

	mov eax, 0
	ret

main ENDP


END