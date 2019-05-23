package include;

import com.mtsystems.coot.NativeHelper;
import com.mtsystems.coot.String8;
import com.sun.jna.Library;

public class Stdio {
	private static interface IndirectMappings extends Library {
		int scanf(String8 format, Object... varargs);
	}

	private final static IndirectMappings INDIRECT_MAPPINGS;

	static {
		NativeHelper h = NativeHelper.get("libc.so.6");
		INDIRECT_MAPPINGS = h.bindIndirect(IndirectMappings.class);
	}
	public static int scanf(String8 format, Object... varargs) {
		return INDIRECT_MAPPINGS.scanf(format, varargs);
	}
}

package demo;

import static com.mtsystems.coot.String8.cs8;
import static include.Stdio.scanf;

import com.mtsystems.coot.IntContainer;

import java.util.Scanner;

public class DemoTranslation {
	public static void main(String[] args) {
		System.out.print("Digite um numero de 1 a 5:");
		IntContainer x = new IntContainer(1);
		x.set(STDIN_SCANNER.nextInt());

		if(x.get() == 1) {
			System.out.print("olá");
		}
		if(x.get() == 2) {
			System.out.print("olá");
		}
		if(x.get() == 3) {
			System.out.print("olá");
		}
		if(x.get() == 4) {
			System.out.print("olá");
		}
		if(x.get() == 5) {
			System.out.print("olá");
		}


		while(x.get() < 1 || x.get() > 5) {
			System.out.print("*Numero invalido*\nDigite novamente:");
			scanf(cs8("%d,"), x);
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
