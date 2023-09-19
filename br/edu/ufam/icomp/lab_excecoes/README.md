
# Exceções
### Introduçao

A empresa privada SpaceX anunciou que irá enviar pessoas a Marte até o ano de 2028 (em 5 anos). Já a agência espacial NASA anunciou que irá enviar pessoas a Marte até 2030 (em 7 anos). Um passo importante em ambos os casos é encontrar o local mais apropriado em Marte para começar a colonização. Para isso, rovers como Curiosity, Perseverance e Ingenuity são usados para encontrar tais locais (dentre outros objetivos). Tais rovers são semiautomáticos, no sentido que um caminho básico (lista de coordenadas) é enviado para eles a partir da Terra e eles seguem o caminho tomando decisões locais quando necessário. Entretanto, como os dados enviados da Terra seguem um meio de comunicação muito instável, medidas precisam ser tomadas para tratar imprevistos como coordenadas inválidas, caminhos inválidos, etc.

### Objetivo

- Neste trabalho, você implementará uma hierarquia de classes de exceções para representar possíveis problemas em um caminho enviado para um rover.
- Além das classes, você irá declarar/implementar métodos que podem disparar exceções (throws/throw) bem com irá usar tais métodos capturando (try) e tratando (catch) as possíveis exceções.

