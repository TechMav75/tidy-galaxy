# Matrix for Model M


led caps -PB5

led scroll -PB4

led num -PB6



matrix
	
	scanrate 1
	
	debounce 5
	

sense		PF1		PF0		PE6		PE7		PB0		PB1		PB2		PB3
	
strobe PC6	UNASSIGNED	UNASSIGNED	LCTRL		UNASSIGNED	UNASSIGNED	UNASSIGNED	RCTRL		UNASSIGNED	
	
strobe PC5	UNASSIGNED	LSHIFT		UNASSIGNED	UNASSIGNED	UNASSIGNED	UNASSIGNED	RSHIFT		UNASSIGNED
	
strobe PC4	ESC		TAB		BACK_QUOTE	1		Q		A		Z		UNASSIGNED
	
strobe PC3	UNASSIGNED	CAPS_LOCK	F1		2		W		S		X		UNASSIGNED
	
strobe PC2	F4		F3		F2		3		E		D		C		UNASSIGNED
	
strobe PC1	G		T		5		4		R		F		V		B
	
strobe PC0	F5		BACKSPACE	F9		F10		UNASSIGNED	BACKSLASH	ENTER		SPACE
	
strobe PE1	H		Y		6		7		U		J		M		N
	
strobe PE0	F6		RIGHT_BRACE	EQUAL		8		I		K		COMMA		UNASSIGNED
	
strobe PD7	UNASSIGNED	F7		F8		9		O		L		PERIOD		UNASSIGNED
	
strobe PD5	QUOTE		LEFT_BRACE	MINUS		0		P		SEMICOLON	UNASSIGNED	SLASH
	
strobe PD4	UNASSIGNED	PAD_4		DELETE		F11		PAD_7		PAD_1		NUM_LOCK	DOWN
	
strobe PD3	PAD_0		PAD_5		INSERT		F12		PAD_8		PAD_2		PAD_SLASH	RIGHT
	
strobe PD2	PAD_PERIOD	PAD_6		PAGE_UP		PAGE_DOWN	PAD_9		PAD_3		PAD_ASTERIX	PAD_MINUS
	
strobe PD1	UP		UNASSIGNED	HOME		END		PAD_PLUS	PAD_ENTER	PAUSE		LEFT
	
strobe PD0	LALT		UNASSIGNED	UNASSIGNED	PRINTSCREEN	SCROLL_LOCK	UNASSIGNED	UNASSIGNED	RALT


end

