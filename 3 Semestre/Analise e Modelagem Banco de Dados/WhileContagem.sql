ALTER PROCEDURE contagem (@Limite INT, @tipo INT)
AS BEGIN  
    DECLARE @i INT
	SET @i= 1
	if @tipo = 1 -- Regressiva
	BEGIN
    
		while @Limite>=1
		BEGIN
			select Valor=@Limite
			SET @Limite = @Limite-1
		END
	END
	if @tipo = 2 -- Crescente
	BEGIN
		while @i<=@Limite
		BEGIN
			select Valor=@i
			SET @i = @i+1
		END
	END
END
