# headlines.py

# Vérification des types : 
# pip3 install mypy
# mypy test_cours.py

"""def headline(text: str, align: bool = True) -> str:
    if align:
        return f"{text.title()}\n{'-' * len(text)}"
    else:
        return f" {text.title()} ".center(50, "o")

print(headline("python type checking"))
print(headline("use mypy", align="center"))"""

if False:
    1 + "deux"    # myPy ne détecte pas ce soucis (pas fait pour ça)
else: 
    1 + 2