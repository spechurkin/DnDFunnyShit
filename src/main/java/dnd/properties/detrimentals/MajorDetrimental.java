package dnd.properties.detrimentals;

import dnd.properties.Properties;

import java.util.Random;

public class MajorDetrimental extends Properties {
    public static String generateProperty() {
        int value = new Random().nextInt(1, 101);
        if (between(value, 1, 5)) {
            return "Пока вы настроены на артефакт, ваше тело в течение четырёх дней гниёт. В 1 день вы теряете волосы, во 2 день ногти на руках и ногах, в 3 день губы и нос, а в конце 4 дня — уши. Заклинание регенерация [regenerate] восстанавливает утерянные части тела";
        } else if (between(value, 6, 10)) {
            return "Пока вы настроены на артефакт, вы каждое утро определяете своё мировоззрение, бросая два раза к6. Для первого броска 1–2 означает законное, 3–4 — нейтральное, а 5–6 — хаотичное. Для второго броска 1–2 означает доброе, 3–4 — нейтральное, а 5–6 — злое";
        } else if (between(value, 11, 15)) {
            return "Когда вы впервые настраиваетесь на артефакт, он даёт вам задание, формулируемое Мастером. Вы должны выполнить это задание, как если бы находились под действием заклинания обет [geas]. Выполнив задание, вы можете игнорировать это свойство";
        } else if (between(value, 16, 20)) {
            return "Артефакт является вместилищем бесплотной жизненной силы, враждебной к вам. Каждый раз, когда вы Действием используете одно из свойств артефакта, существует 50% шанс, что эта жизненная сила попытается покинуть артефакт и завладеть вашим телом. Если вы провалите спасбросок Харизмы со Сл 20, она преуспеет, и вы станете ПМ под управлением Мастера, пока эту сущность не изгонят такой магией как заклинание рассеивание добра и зла";
        } else if (between(value, 21, 25)) {
            return "Хиты существ с показателем опасности 0, а также растений, не являющиеся существами, опускаются до 0, когда оказываются в пределах 10 футов от артефакта";
        } else if (between(value, 26, 30)) {
            return "Артефакт является местом заточения смертельного слаада [death slaad]. Каждый раз, когда вы действием используете одно из свойств артефакта, у слаада есть 10-процентный шанс сбежать, в случае чего он появляется в пределах 15 футов и нападает на вас";
        } else if (between(value, 31, 35)) {
            return "Пока вы настроены на артефакт, существа определённого вида кроме «гуманоид» (определяется Мастером) всегда враждебны по отношению к вам";
        } else if (between(value, 36, 40)) {
            return "Артефакт портит магические зелья в пределах 10 футов от себя, делая их немагическими";
        } else if (between(value, 41, 45)) {
            return "Артефакт стирает магические свитки в пределах 10 футов от себя, делая их немагическими";
        } else if (between(value, 46, 50)) {
            return "Прежде чем использовать действием одно из свойств артефакта, вы должны бонусным действием пустить кровь себе, согласному существу или недееспособному существу, используя колющее или рубящее рукопашное оружие. Субъект получает урон 1к4 соответствующего вида";
        } else if (between(value, 51, 60)) {
            return "Когда вы настраиваетесь на артефакт, вы получаете долговременное безумие";
        } else if (between(value, 61, 65)) {
            return "Вы получаете урон психической энергией 4к10, когда настраиваетесь на артефакт";
        } else if (between(value, 66, 70)) {
            return "Вы получаете урон психической энергией 8к10, когда настраиваетесь на артефакт";
        } else if (between(value, 71, 80)) {
            return "Прежде чем настроиться на артефакт, вы должны убить существо со своим мировоззрением";
        } else if (between(value, 76, 80)) {
            return "Когда вы настраиваетесь на артефакт, одна из ваших характеристик, выбранная случайным образом, уменьшается на 2. Заклинание высшее восстановление [greater restoration] восстанавливает характеристику";
        } else if (between(value, 81, 85)) {
            return "Каждый раз, когда вы настраиваетесь на артефакт, вы стареете на 3к10 лет. Вы должны преуспеть в спасброске Телосложения со Сл 10 или умрёте от потрясения. Если умрёте, вы мгновенно превращаетесь в умертвие [wight] под управлением Мастера, которое обязано защищать артефакт";
        } else if (between(value, 86, 90)) {
            return "Пока вы настроены на артефакт, вы теряете способность разговаривать";
        } else if (between(value, 91, 95)) {
            return "Пока вы настроены на артефакт, вы обладаете уязвимостью ко всем видам урона";
        } else {
            return "Когда вы настраиваетесь на артефакт, существует 10%, что вы привлечёте внимание божества, которое отправит своего аватара чтобы забрать у вас артефакт. Мировоззрение аватара совпадает с мировоззрением его создателя, и он обладает характеристиками Эмпирея. Заполучив артефакт, аватар исчезает";
        }
    }
}
