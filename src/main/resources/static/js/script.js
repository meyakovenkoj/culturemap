$( document ).ready(function () {

    var n = 1;
    $( "#addParam" ).click(function(e) {
        e.stopPropagation();
        $("#selects").append('<select id="select$n"><option>Пункт 1</option><option>Пункт 2</option></select><input id="text1" maxlength="2048" name="t$n" type="text" title="Текст" value="Текст" aria-label="Текст$n">');
    });
});