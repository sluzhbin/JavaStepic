/*Вам дан список ролей и сценарий пьесы в виде массива строчек. 
 *Каждая строчка сценария пьесы дана в следующем виде: 
 *Роль: текст
 *Текст может содержать любые символы.
 * Напишите метод, который будет группировать строчки 
 * по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример). 
 * Каждая группа распечатывается в следующем виде:
 * Роль:
i) текст
j) текст2
...
==перевод строки==
 * i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы 
 * следует в соответствии с порядком ролей. 
 * Переводы строк между группами обязательны, переводы строк в конце текста не учитываются. 
 * 
 */
public class TextPerRole {
	private static String printTextPerRole(String[] roles, String[] textLines) {
		StringBuilder result = new StringBuilder();
		for (String role : roles) {
			result.append(role).append(":\n");
			for (int i = 0; i < textLines.length; i++)
				if (textLines[i].startsWith(role + ":"))
					result.append(i + 1).append(") ").append(textLines[i].substring(role.length() + 2)).append("\n");
			result.append("\n");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String[] roles = { "Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич" };
		String[] textLines = {
				"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
				"Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
				"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
				"Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
				"Лука Лукич: Господи боже! еще и с секретным предписаньем!" };
		System.out.println(printTextPerRole(roles, textLines));
	}
}
